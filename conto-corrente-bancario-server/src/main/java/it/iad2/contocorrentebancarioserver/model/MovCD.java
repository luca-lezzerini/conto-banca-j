package it.iad2.contocorrentebancarioserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import it.iad2.contocorrentebancarioserver.controller.MovimentaCDController;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MovCD extends MovimentoGenerico implements Serializable {

    @JsonIgnoreProperties(value = "listaMovCD", allowSetters = true, allowGetters = true)
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoCorrente contoC;
    
    @JsonIgnoreProperties(value = "listaMovCD", allowSetters = true, allowGetters = true)
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private ContoDeposito contoD;

    public MovCD() {
    }

    public MovCD(LocalDate dataMov, String tipoMov, double importoMov) {
        super(dataMov, tipoMov, importoMov);
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
