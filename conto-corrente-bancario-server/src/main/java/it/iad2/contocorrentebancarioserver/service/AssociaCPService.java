/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;


import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

/**
 *
 * @author user
 */
public interface AssociaCPService {
    
    void associaCP(Cliente cliente, ContoPrestito conto);
    
    ContoPrestitoDto cercaCP(String codice);
    
}
