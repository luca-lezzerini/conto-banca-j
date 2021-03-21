/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

/**
 *
 * @author lenovo
 */
public class NumCDDto {
    
        private String codice;

    public NumCDDto() {
    }

    public NumCDDto(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "NumCDDto{" + "codice=" + codice + '}';
    }
        
        
    
}
