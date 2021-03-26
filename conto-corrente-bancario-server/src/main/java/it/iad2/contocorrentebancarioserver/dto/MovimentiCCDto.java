/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.MovCC;
import java.util.List;

/**
 *
 * @author utente
 */
public class MovimentiCCDto {
    List<MovCC> listaMovCC;

    public MovimentiCCDto() {
    }

    public MovimentiCCDto(List<MovCC> listaMovCC) {
        this.listaMovCC = listaMovCC;
    }

    public List<MovCC> getListaMovCC() {
        return listaMovCC;
    }

    public void setListaMovCC(List<MovCC> listaMovCC) {
        this.listaMovCC = listaMovCC;
    }

    @Override
    public String toString() {
        return "MovimentiCCDto{" + "listaMovCC=" + listaMovCC + '}';
    }
    
}
