package it.iad2.contocorrentebancarioserver.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "mov_type",
        discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
public class MovimentoGenerico implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private LocalDate dataMov;
    @Column
    private String tipoMov;
    @Column
    private Double importoMov;

    public MovimentoGenerico() {
    }

    public MovimentoGenerico(LocalDate dataMov, String tipoMov, Double importoMov) {
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

    public Double getImportoMov() {
        return importoMov;
    }

    public void setImportoMov(Double importoMov) {
        this.importoMov = importoMov;
    }

}
