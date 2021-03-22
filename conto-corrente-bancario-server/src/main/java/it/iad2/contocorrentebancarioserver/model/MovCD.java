package it.iad2.contocorrentebancarioserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MovCD implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDate dataMov;

    @Column
    private String tipoMov;

    @Column
    private double importoMov;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoCorrente contoC;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoDeposito contoD;

    public MovCD() {
    }

    public MovCD(LocalDate dataMov, String tipoMov, double importoMov) {
        this.dataMov = dataMov;
        this.tipoMov = tipoMov;
        this.importoMov = importoMov;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataMov() {
        return dataMov;
    }

    public void setDataMov(LocalDate dataMov) {
        this.dataMov = dataMov;
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

    public ContoCorrente getContoC() {
        return contoC;
    }

    public void setContoC(ContoCorrente contoC) {
        this.contoC = contoC;
    }

    public ContoDeposito getContoD() {
        return contoD;
    }

    public void setContoD(ContoDeposito contoD) {
        this.contoD = contoD;
    }

}
