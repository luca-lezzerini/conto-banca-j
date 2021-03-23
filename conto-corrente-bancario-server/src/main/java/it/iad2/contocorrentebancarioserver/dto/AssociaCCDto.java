package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;

public class AssociaCCDto {

    private Cliente cliente;
    private ContoCorrente contoCorrente;

    public AssociaCCDto() {
    }

    public AssociaCCDto(Cliente cliente, ContoCorrente contoCorrente) {
        this.cliente = cliente;
        this.contoCorrente = contoCorrente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContoCorrente getContoCorrente() {
        return contoCorrente;
    }

    public void setContoCorrente(ContoCorrente contoCorrente) {
        this.contoCorrente = contoCorrente;
    }
}
