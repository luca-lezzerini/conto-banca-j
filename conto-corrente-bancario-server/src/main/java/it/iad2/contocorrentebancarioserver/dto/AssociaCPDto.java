package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public class AssociaCPDto {

    private Cliente cliente;
    private ContoPrestito contoPrestito;

    public AssociaCPDto() {
    }

    public AssociaCPDto(Cliente cliente, ContoPrestito contoPrestito) {
        this.cliente = cliente;
        this.contoPrestito = contoPrestito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContoPrestito getContoPrestito() {
        return contoPrestito;
    }

    public void setContoPrestito(ContoPrestito contoPrestito) {
        this.contoPrestito = contoPrestito;
    }
}
