/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.MovCD;
import java.util.List;

/**
 *
 * @author matte
 */
public class ListaMovCDDto {
    
    List<MovCD> listaMovCD;

    public ListaMovCDDto() {
    }

    public ListaMovCDDto(List<MovCD> listaMovCD) {
        this.listaMovCD = listaMovCD;
    }

    public List<MovCD> getListaMovCD() {
        return listaMovCD;
    }

    public void setListaMovCD(List<MovCD> listaMovCD) {
        this.listaMovCD = listaMovCD;
    }

    @Override
    public String toString() {
        return "ListaMovCDDto{" + "listaMovCD=" + listaMovCD + '}';
    }
    
    
    
    
    
}
