/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface GestioneCDService {

    List<ContoDeposito> aggiungi(String numConto);

    List<ContoDeposito> aggiorna();

    List<ContoDeposito> elimina(ContoDeposito conto);

    List<ContoDeposito> modifica(ContoDeposito conto, String nuovoContoDeposito);

}
