package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import java.util.List;

public class SaldoCCDto {

    private List<ContoCorrente> listaCC;
    private Double saldo;

    public SaldoCCDto() {
    }

    public SaldoCCDto(List<ContoCorrente> listaCC, Double saldo) {
        this.listaCC = listaCC;
        this.saldo = saldo;
    }

    public List<ContoCorrente> getListaCC() {
        return listaCC;
    }

    public void setListaCC(List<ContoCorrente> listaCC) {
        this.listaCC = listaCC;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
    

}
