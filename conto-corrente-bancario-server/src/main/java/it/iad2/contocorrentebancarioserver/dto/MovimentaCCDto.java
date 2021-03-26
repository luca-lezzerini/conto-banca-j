package it.iad2.contocorrentebancarioserver.dto;

import java.util.Date;

public class MovimentaCCDto {

    private String tipoMovCC;
    private Date data;
    private double importo;
    private String codice;

    public MovimentaCCDto() {
    }

    public MovimentaCCDto(String tipoMovCC, Date data, double importo, String codice) {
        this.tipoMovCC = tipoMovCC;
        this.data = data;
        this.importo = importo;
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTipoMovCC() {
        return tipoMovCC;
    }

    public void setTipoMovCC(String tipoMovCC) {
        this.tipoMovCC = tipoMovCC;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "MovimentaCCDto{" + "tipoMovCC=" + tipoMovCC + ", data=" + data + ", importo=" + importo + ", codice=" + codice + '}';
    }

}
