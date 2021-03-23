package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;


public interface AssociaCDService {

    void associaCD(Cliente cliente, ContoDeposito conto);

    ContoDeposito trovaConto(String codice);
}
