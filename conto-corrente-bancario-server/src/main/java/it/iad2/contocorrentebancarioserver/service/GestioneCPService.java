package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public interface GestioneCPService {

    ListaCPDto add(String stringa);

    ListaCPDto delete(String stringa);

    ListaCPDto edit(ContoPrestito contoPrestito);

    ListaCPDto aggiorna();

}
