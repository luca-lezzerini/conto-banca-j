/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ListaCCDto {
    
    List<ContoCorrente> listaCC; 

    public ListaCCDto() {
    }

    public ListaCCDto(List<ContoCorrente> listaCC) {
        this.listaCC = listaCC;
    }

    public List<ContoCorrente> getListaCC() {
        return listaCC;
    }

    public void setListaCC(List<ContoCorrente> listaCC) {
        this.listaCC = listaCC;
    }

    @Override
    public String toString() {
        return "ListaCCDto{" + "listaCC=" + listaCC + '}';
    }
    
    
}
