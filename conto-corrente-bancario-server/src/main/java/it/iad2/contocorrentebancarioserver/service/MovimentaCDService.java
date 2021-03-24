package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

public interface MovimentaCDService {

    void eseguiMovimento(ContoDeposito conto, String tipoMovimento, Double importo);
}
