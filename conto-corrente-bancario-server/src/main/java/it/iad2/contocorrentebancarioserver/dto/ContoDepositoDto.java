/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

/**
 *
 * @author lenovo
 */
public class ContoDepositoDto {
    
    private ContoDeposito conto;

    public ContoDepositoDto() {
    }

    public ContoDepositoDto(ContoDeposito conto) {
        this.conto = conto;
    }

    public ContoDeposito getConto() {
        return conto;
    }

    public void setConto(ContoDeposito conto) {
        this.conto = conto;
    }

    @Override
    public String toString() {
        return "ContoDepositoDto{" + "conto=" + conto + '}';
    }
    
}
