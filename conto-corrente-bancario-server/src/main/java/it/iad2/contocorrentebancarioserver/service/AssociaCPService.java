package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.AssociaCPDto;
import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public interface AssociaCPService {

    AssociaCPDto associaCP(Cliente cliente, ContoPrestito conto);

    ContoPrestitoDto cercaCP(String codice);

}
