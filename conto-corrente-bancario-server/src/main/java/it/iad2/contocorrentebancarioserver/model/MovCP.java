package it.iad2.contocorrentebancarioserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MovCP extends MovimentoGenerico implements Serializable {

    @JsonIgnoreProperties(value = "listaMovCP", allowSetters = true, allowGetters = true)
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoCorrente contoC;
    
    @JsonIgnoreProperties(value = "listaMovCP", allowSetters = true, allowGetters = true)
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoPrestito contoP;

    public MovCP() {
    }

    public MovCP(LocalDate dataMov, String tipoMov, double importoMov) {
        super(dataMov, tipoMov, importoMov);
    }

    public ContoCorrente getContoC() {
        return contoC;
    }

    public void setContoC(ContoCorrente contoC) {
        this.contoC = contoC;
    }

    public ContoPrestito getContoP() {
        return contoP;
    }

    public void setContoP(ContoPrestito contoP) {
        this.contoP = contoP;
    }

}
