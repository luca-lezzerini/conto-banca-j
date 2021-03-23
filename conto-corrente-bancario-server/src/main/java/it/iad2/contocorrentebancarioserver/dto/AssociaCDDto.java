/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

/**
 *
 * @author matte
 */
public class AssociaCDDto {

    private Cliente cliente;
    private ContoDeposito conto;

    public AssociaCDDto(Cliente cliente, ContoDeposito conto) {
        this.cliente = cliente;
        this.conto = conto;
    }

    public AssociaCDDto() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContoDeposito getConto() {
        return conto;
    }

    public void setConto(ContoDeposito conto) {
        this.conto = conto;
    }

    @Override
    public String toString() {
        return "AssociaCDDto{" + "cliente=" + cliente + ", conto=" + conto + '}';
    }

}
