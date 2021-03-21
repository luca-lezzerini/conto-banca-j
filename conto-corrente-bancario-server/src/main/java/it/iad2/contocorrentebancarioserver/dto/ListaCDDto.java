/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ListaCDDto {
    
     List<ContoDeposito> listaCD; 

    @Override
    public String toString() {
        return "ListaCDDto{" + "listaCD=" + listaCD + '}';
    }

    public List<ContoDeposito> getListaCD() {
        return listaCD;
    }

    public void setListaCD(List<ContoDeposito> listaCD) {
        this.listaCD = listaCD;
    }

    public ListaCDDto(List<ContoDeposito> listaCD) {
        this.listaCD = listaCD;
    }

    public ListaCDDto() {
    }
    
}
