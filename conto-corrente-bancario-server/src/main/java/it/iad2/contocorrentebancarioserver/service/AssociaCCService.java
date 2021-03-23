package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;

public interface AssociaCCService {

    ContoCorrente cercaCCEquals(ContoCorrente conto);

    String associaCC(Cliente cliente, ContoCorrente contoCorrente);

}
