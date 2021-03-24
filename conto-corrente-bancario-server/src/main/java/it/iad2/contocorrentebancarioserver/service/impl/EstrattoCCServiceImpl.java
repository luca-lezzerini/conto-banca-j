package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCCDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.MovCC;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCCRepository;
import it.iad2.contocorrentebancarioserver.service.EstrattoCCService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstrattoCCServiceImpl implements EstrattoCCService{

    @Autowired
    ContoCorrenteRepository contoCCRepository;
    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public ListaCCDto mostraContiCC(Cliente cliente) {
        cliente = clienteRepository.findById(cliente.getId()).get();
        List<ContoCorrente> listaCC = cliente.getListaContiC();
        return new ListaCCDto(listaCC);
    }

    @Override
    public ListaMovCCDto mostraMovCC(ContoCorrente contoCC) {
        contoCC = contoCCRepository.findById(contoCC.getId()).get();
        List<MovCC> movCC = contoCC.getListaMovCC();
        return new ListaMovCCDto(movCC);
    }

}
