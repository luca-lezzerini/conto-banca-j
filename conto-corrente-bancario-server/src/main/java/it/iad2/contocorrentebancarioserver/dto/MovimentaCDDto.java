package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;

public class MovimentaCDDto {
    ContoDeposito conto;
    Double importo;
    String tipoMovimento;

    public MovimentaCDDto() {
    }

    public MovimentaCDDto(ContoDeposito conto, Double importo, String tipoMovimento) {
        this.conto = conto;
        this.importo = importo;
        this.tipoMovimento = tipoMovimento;
    }

    public ContoDeposito getConto() {
        return conto;
    }

    public void setConto(ContoDeposito conto) {
        this.conto = conto;
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    @Override
    public String toString() {
        return "MovimentaCDDto{" +
                "conto=" + conto +
                ", importo=" + importo +
                ", tipoMovimento='" + tipoMovimento + '\'' +
                '}';
    }
}
