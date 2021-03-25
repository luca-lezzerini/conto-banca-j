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
public class MovCC extends MovimentoGenerico implements Serializable {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoCorrente contoC;

    public MovCC() {
    }

    public MovCC(LocalDate dataMov, String tipoMov, double importoMov) {
        super(dataMov, tipoMov, importoMov);
    }
    
    public ContoCorrente getContoC() {
        return contoC;
    }

    public void setContoC(ContoCorrente contoC) {
        this.contoC = contoC;
    }
    
}
