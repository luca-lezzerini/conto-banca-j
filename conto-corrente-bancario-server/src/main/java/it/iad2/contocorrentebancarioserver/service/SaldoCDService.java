/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.SaldoCDDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import java.util.List;

/**
 *
 * @author matte
 */
public interface SaldoCDService {
    
    List<ContoDeposito> ricercaCD(Cliente cliente);
    
    SaldoCDDto saldoCD(String conto);
    
    
    
}
