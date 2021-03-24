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
 * @author matte
 */
public class SaldoCDDto {
    
    private double saldo;
    private List<ContoDeposito> listaCD;

    public SaldoCDDto() {
    }

    public SaldoCDDto(double saldo, List<ContoDeposito> listaCD) {
        this.saldo = saldo;
        this.listaCD = listaCD;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<ContoDeposito> getListaCD() {
        return listaCD;
    }

    public void setListaCD(List<ContoDeposito> listaCD) {
        this.listaCD = listaCD;
    }

    @Override
    public String toString() {
        return "SaldoCDDto{" + "saldo=" + saldo + ", listaCD=" + listaCD + '}';
    }
             
    
}
