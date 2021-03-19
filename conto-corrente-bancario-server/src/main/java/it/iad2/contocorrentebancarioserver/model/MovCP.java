package it.iad2.contocorrentebancarioserver.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovCP {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDate dataMov;

    @Column
    private String tipoMov;

    @Column
    private double importoMov;

    public MovCP() {
    }

    public MovCP(LocalDate datamov, String tipoMov, double importoMov) {
        this.dataMov = datamov;
        this.tipoMov = tipoMov;
        this.importoMov = importoMov;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatamov() {
        return dataMov;
    }

    public void setDatamov(LocalDate datamov) {
        this.dataMov = datamov;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public double getImportoMov() {
        return importoMov;
    }

    public void setImportoMov(double importoMov) {
        this.importoMov = importoMov;
    }

}
