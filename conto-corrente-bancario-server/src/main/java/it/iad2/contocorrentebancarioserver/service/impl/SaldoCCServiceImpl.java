package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.SaldoCCDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.MovCC;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.service.SaldoCCService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldoCCServiceImpl implements SaldoCCService {

    @Autowired
    ContoCorrenteRepository contoCorrenteRepository;
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ContoCorrente> ricercaCC(Cliente cliente) {
        return clienteRepository.findById(cliente.getId()).get().getListaContiC();
    }

    @Override
    public SaldoCCDto saldoCC(String conto) {

        // recupera tutti i conti del cliente intestatario di un dato conto
        List<ContoCorrente> cc = contoCorrenteRepository.findByNumConto(conto).getCliente().getListaContiC();

        // calcola il saldo
        double saldoCC = 0;
        List<MovCC> listaMovCC = contoCorrenteRepository.findByNumConto(conto).getListaMovCC();
        for (MovCC movCC : listaMovCC) {
            if (movCC.getTipoMov().equalsIgnoreCase("versamento")) {
                saldoCC += movCC.getImportoMov();
            } else if (movCC.getTipoMov().equalsIgnoreCase("prelievo")) {
                saldoCC -= movCC.getImportoMov();
            } else if (movCC.getTipoMov().equalsIgnoreCase("bonificoUscita")) {
                saldoCC -= movCC.getImportoMov();
            }
        }
        return new SaldoCCDto(cc, saldoCC);
    }

    private void calcolaSaldo2(String conto) {
        List<MovCC> listaMovCC = contoCorrenteRepository.findByNumConto(conto).getListaMovCC();
        double saldoCC = 0;
        for (MovCC movCC : listaMovCC) {
            switch (movCC.getTipoMov()) {
                case "versamento":
                    saldoCC += movCC.getImportoMov();
                    break;
                case "prelievo":
                case "bonificoUscita":
                    saldoCC -= movCC.getImportoMov();
                    break;
            }
        }
    }

    private void calcolaSaldo3(String conto) {
        List<MovCC> listaMovCC = contoCorrenteRepository.findByNumConto(conto).getListaMovCC();
        double saldoCC = 0;
        for (MovCC movCC : listaMovCC) {

            saldoCC += switch (movCC.getTipoMov()) {
                case "versamento" ->
                    movCC.getImportoMov();
                case "prelievo", "bonificoUscita" ->
                    -movCC.getImportoMov();
                default ->
                    0;
            };
        }
    }

    private void calcolaSaldo4(String conto) {
        List<MovCC> listaMovCC = contoCorrenteRepository.findByNumConto(conto).getListaMovCC();
        
        double saldoCC = listaMovCC
                .parallelStream()
                .mapToDouble(movCC
                        -> switch (movCC.getTipoMov()) {
                                case "versamento" ->
                                    movCC.getImportoMov();
                                case "prelievo", "bonificoUscita" ->
                                    -movCC.getImportoMov();
                                default ->
                                    0;
                    })
                .sum();
    }
}
