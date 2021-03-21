/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

/**
 *
 * @author lenovo
 */
public class ModificaCDDto {

    private ContoDeposito conto;
    private String nuovoNumeroConto;

    public ModificaCDDto(ContoDeposito conto, String nuovoNumeroConto) {
        this.conto = conto;
        this.nuovoNumeroConto = nuovoNumeroConto;
    }

    public ModificaCDDto() {
    }

    public ContoDeposito getConto() {
        return conto;
    }

    public void setConto(ContoDeposito conto) {
        this.conto = conto;
    }

    public String getNuovoNumeroConto() {
        return nuovoNumeroConto;
    }

    public void setNuovoNumeroConto(String nuovoNumeroConto) {
        this.nuovoNumeroConto = nuovoNumeroConto;
    }

    @Override
    public String toString() {
        return "ModificaCDDto{" + "conto=" + conto + ", nuovoNumeroConto=" + nuovoNumeroConto + '}';
    }
    
    

}
