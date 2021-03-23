package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.service.EstrattoCPService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstrattoCPServiceImpl implements EstrattoCPService {

    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ListaClientiDto cercaCliente(String cognome) {
        return new ListaClientiDto(clienteRepository.findByCognomeContains(cognome));
    }

    @Override
    public ListaContoPrestitoDto CaricaConti(Cliente cliente) {
        cliente = clienteRepository.findById(cliente.getId()).get();
        List<ContoPrestito> cp = cliente.getListaContiP();
        return new ListaContoPrestitoDto(cp);
    }
}
