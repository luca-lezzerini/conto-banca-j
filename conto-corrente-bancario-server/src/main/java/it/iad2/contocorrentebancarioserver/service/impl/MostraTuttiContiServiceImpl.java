package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContiClienteDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.iad2.contocorrentebancarioserver.service.MostraTuttiContiService;

@Service
public class MostraTuttiContiServiceImpl implements MostraTuttiContiService {

    @Autowired
    ContoCorrenteRepository contoCorrenteRepository;

    @Autowired
    ContoDepositoRepository contoDepositoRepository;
    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ListaClientiDto cercaCliente(String cognome) {
        return new ListaClientiDto(clienteRepository.findByCognomeContains(cognome));
    }

    @Override
    public ListaContiClienteDto CaricaConti(Cliente cliente) {

        List<ContoCorrente> cc = new ArrayList<>(contoCorrenteRepository.findByCliente(cliente.getId()));
        List<ContoDeposito> cd = new ArrayList<>(contoDepositoRepository.findByCliente(cliente.getId()));
        List<ContoPrestito> cp = new ArrayList<>(contoPrestitoRepository.findByCliente(cliente.getId()));
        return new ListaContiClienteDto(cc, cd, cp);
    }
}
