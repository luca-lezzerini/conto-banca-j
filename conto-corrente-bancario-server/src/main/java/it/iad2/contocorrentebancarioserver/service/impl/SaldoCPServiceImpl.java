package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.SaldoCPDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.model.MovCC;
import it.iad2.contocorrentebancarioserver.model.MovCP;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.service.SaldoCPService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldoCPServiceImpl implements SaldoCPService{
    
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Override
    public List<ContoPrestito> ricercaCP(Cliente cliente) {
        return clienteRepository.findById(cliente.getId()).get().getListaContiP();
    }

    @Override
    public SaldoCPDto saldoCP(String conto) {
        List<ContoPrestito> cc = contoPrestitoRepository.findByCodice(conto).getCliente().getListaContiP();

        double saldoCC = 0;
        List<MovCP> listaMovCP = contoPrestitoRepository.findByCodice(conto).getListaMovCP();
        for (MovCP movCP : listaMovCP) {
            if (movCP.getTipoMov().equalsIgnoreCase("concessione")) {
                saldoCC += movCP.getImportoMov();
            } else if (movCP.getTipoMov().equalsIgnoreCase("rimborso")) {
                saldoCC += movCP.getImportoMov();
            } else if (movCP.getTipoMov().equalsIgnoreCase("erogazione")) {
                saldoCC -= movCP.getImportoMov();
            }
        }
        return new SaldoCPDto(cc, saldoCC);
    }
    
    
    
}
