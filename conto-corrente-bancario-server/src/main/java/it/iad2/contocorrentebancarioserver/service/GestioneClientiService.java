package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;

public interface GestioneClientiService {

    ListaClientiDto aggiungi(Cliente cliente);

    ListaClientiDto modifica(Cliente cliente);

    ListaClientiDto cancella(Cliente cliente);

    ListaClientiDto aggiorna();
}
