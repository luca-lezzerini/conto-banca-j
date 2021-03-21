package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public class ContoPrestitoDto {

    private ContoPrestito contoPrestito;

    public ContoPrestitoDto() {
    }

    public ContoPrestitoDto(ContoPrestito contoPrestito) {
        this.contoPrestito = contoPrestito;
    }

    public ContoPrestito getContoPrestito() {
        return contoPrestito;
    }

    public void setContoPrestito(ContoPrestito contoPrestito) {
        this.contoPrestito = contoPrestito;
    }

    @Override
    public String toString() {
        return "ContoPrestitoDto{" + "contoPrestito=" + contoPrestito + '}';
    }
}
