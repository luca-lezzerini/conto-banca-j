package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public interface GestioneCPService {

    ListaCPDto add(ContoPrestito cp);

    ListaCPDto delete(ContoPrestito cp);

    ListaCPDto edit(ContoPrestito cp);

    ListaCPDto aggiorna();

}
