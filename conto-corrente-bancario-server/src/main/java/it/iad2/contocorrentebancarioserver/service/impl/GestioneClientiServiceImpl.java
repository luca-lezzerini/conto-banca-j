package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.service.GestioneClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GestioneClientiServiceImpl implements GestioneClientiService {

    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public ListaClientiDto aggiungi(Cliente cliente) {
        clienteRepository.save(cliente);
        return aggiorna();
    }

    @Override
    public ListaClientiDto modifica(Cliente cliente) {
        clienteRepository.save(cliente);
        return aggiorna();
    }

    @Override
    public ListaClientiDto cancella(Cliente cliente) {
        clienteRepository.delete(cliente);
        return aggiorna();
    }

    @Override
    public ListaClientiDto aggiorna() {
        return new ListaClientiDto(clienteRepository.findAll());
    }

    @Override
    public ListaClientiDto ricercaContains(String s) {
        return new ListaClientiDto(clienteRepository.findByCognomeContains(s));
    }

    @Override
    public ListaClientiDto ricercaEquals(String s) {
        return new ListaClientiDto(clienteRepository.findByCognomeEquals(s));
    }

    @Override
    public ListaClientiDto ricercaLike(String s) {
        return new ListaClientiDto(clienteRepository.findByCognomeLike(s));
    }

    @Override
    public Page<Cliente> clientiPaginati(int numPage, int elemPage) {
        return clienteRepository.trovaTuttiPaginati3(PageRequest.of(numPage, elemPage));
    }

    
}
