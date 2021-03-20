/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface GestioneCCService {
    
    List<ContoCorrente> nuovo(String numConto);
    
    List<ContoCorrente> aggiorna();
    
    List<ContoCorrente> aggiungi();
    
    
    
    
    //aggiungere metodo aggiungi
}
