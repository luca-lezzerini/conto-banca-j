/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaCDDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCDDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

/**
 *
 * @author matte
 */
public interface EstrattoContoCDService {
        
    ListaCDDto mostraContiCD(Cliente cliente);
    
    ListaMovCDDto mostraMovCD(ContoDeposito contoCD);



}
