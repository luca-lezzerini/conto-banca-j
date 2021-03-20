/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;

/**
 *
 * @author lenovo
 */
public class ContoCorrenteDto {

    private ContoCorrente conto;

    public ContoCorrenteDto() {
    }

    public ContoCorrenteDto(ContoCorrente conto) {
        this.conto = conto;
    }

    public ContoCorrente getConto() {
        return conto;
    }

    public void setConto(ContoCorrente conto) {
        this.conto = conto;
    }

    @Override
    public String toString() {
        return "ContoCorrenteDto{" + "conto=" + conto + '}';
    }

}
