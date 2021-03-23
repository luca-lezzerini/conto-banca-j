package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.AssociaCPDto;
import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.service.AssociaCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociaCPServiceImpl implements AssociaCPService {

    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public AssociaCPDto associaCP(Cliente cliente, ContoPrestito conto) {
        conto.setCliente(cliente);
        return new AssociaCPDto(cliente, contoPrestitoRepository.save(conto));
    }

    @Override
    public ContoPrestitoDto cercaCP(String codice) {
        return new ContoPrestitoDto(contoPrestitoRepository.findByCodiceEquals(codice).get(0));
    }
}
