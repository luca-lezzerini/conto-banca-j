package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public class NumCPDto {

    private ContoPrestito contoprestito;

    public NumCPDto() {
    }

    public NumCPDto(ContoPrestito contoprestito) {
        this.contoprestito = contoprestito;
    }

    public ContoPrestito getContoprestito() {
        return contoprestito;
    }

    public void setContoprestito(ContoPrestito contoprestito) {
        this.contoprestito = contoprestito;
    }

    @Override
    public String toString() {
        return "NumCPDto{" + "contoprestito=" + contoprestito + '}';
    }
    

    

}
