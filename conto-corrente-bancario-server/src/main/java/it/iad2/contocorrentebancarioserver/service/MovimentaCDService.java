package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.MovCD;

import java.util.List;

public interface MovimentaCDService {

    void eseguiMovimento(ContoDeposito conto, String tipoMovimento, Double importo);

    List<MovCD> mostraMovimentiConto(ContoDeposito conto);
}
