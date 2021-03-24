package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;


public class SaldoCPDto {
    
    private List<ContoPrestito> listaCP;
    private Double saldo;

    public SaldoCPDto() {
    }

    public SaldoCPDto(List<ContoPrestito> listaCP, Double saldo) {
        this.listaCP = listaCP;
        this.saldo = saldo;
    }

    public List<ContoPrestito> getListaCP() {
        return listaCP;
    }

    public void setListaCP(List<ContoPrestito> listaCP) {
        this.listaCP = listaCP;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
