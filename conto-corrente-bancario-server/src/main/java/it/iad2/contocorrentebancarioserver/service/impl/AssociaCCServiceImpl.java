package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.service.AssociaCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociaCCServiceImpl implements AssociaCCService {

    @Autowired
    ContoCorrenteRepository contoCorrenteRepository;
    @Autowired
    ClienteRepository ClienteRepository;

    @Override
    public ContoCorrente cercaCCEquals(ContoCorrente conto) {
        return contoCorrenteRepository.findByNumConto(conto.getNumConto());
    }

    @Override
    public String associaCC(Cliente cliente, ContoCorrente contoCorrente) {
        contoCorrente.setCliente(cliente);
        contoCorrenteRepository.save(contoCorrente);
        cliente.getListaContiC().add(contoCorrente);
        ClienteRepository.save(cliente);
        return "ok";
    }

}
