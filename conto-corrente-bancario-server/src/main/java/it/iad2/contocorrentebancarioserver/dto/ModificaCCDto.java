package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;

public class ModificaCCDto {
    private ContoCorrente conto;
    private String nuovoNumeroConto;

    public ModificaCCDto() {
    }

    public ModificaCCDto(ContoCorrente conto, String nuovoNumeroConto) {
        this.conto = conto;
        this.nuovoNumeroConto = nuovoNumeroConto;
    }

    public ContoCorrente getConto() {
        return conto;
    }

    public void setConto(ContoCorrente conto) {
        this.conto = conto;
    }

    public String getNuovoNumeroConto() {
        return nuovoNumeroConto;
    }

    public void setNuovoNumeroConto(String nuovoNumeroConto) {
        this.nuovoNumeroConto = nuovoNumeroConto;
    }

    @Override
    public String toString() {
        return "modificaCCDto{" +
                "conto=" + conto +
                ", nuovoNumeroConto='" + nuovoNumeroConto + '\'' +
                '}';
    }
}
