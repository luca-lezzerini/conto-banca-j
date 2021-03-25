package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import org.springframework.data.domain.Page;

public interface GestioneClientiService {

    ListaClientiDto aggiungi(Cliente cliente);

    ListaClientiDto modifica(Cliente cliente);

    ListaClientiDto cancella(Cliente cliente);

    ListaClientiDto aggiorna();
    
    ListaClientiDto ricercaContains(String s);
    
    ListaClientiDto ricercaEquals(String s);
    
    ListaClientiDto ricercaLike(String s);
    
    Page<Cliente> clientiPaginati(int numPage, int elemPage);
}
