package it.iad2.contocorrentebancarioserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ContoCorrente implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String numConto;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Cliente cliente;
    
    @JsonIgnoreProperties(value = "contoC", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "contoC")
    private List<MovCC> listaMovCC;
    
    @JsonIgnoreProperties(value = "contoC", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "contoC")
    private List<MovCD> listaMovCD;
    
    @JsonIgnoreProperties(value = "contoC", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "contoC")
    private List<MovCP> listaMovCP;

    public ContoCorrente() {
    }

    public ContoCorrente(String codice) {
        this.numConto = codice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getCodice() {
//        return numConto;
//    }
//
//    public void setCodice(String codice) {
//        this.numConto = codice;
//    }

    public String getNumConto() {
        return numConto;
    }

    public void setNumConto(String numConto) {
        this.numConto = numConto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<MovCC> getListaMovCC() {
        if (listaMovCC == null){
            listaMovCC = new ArrayList<>();
        }
        return listaMovCC;
    }

    public void setListaMovCC(List<MovCC> listaMovCC) {
        this.listaMovCC = listaMovCC;
    }

    public List<MovCD> getListaMovCD() {
        if (listaMovCD == null){
            listaMovCD = new ArrayList<>();
        }
        return listaMovCD;
    }

    public void setListaMovCD(List<MovCD> listaMovCD) {
        this.listaMovCD = listaMovCD;
    }

    public List<MovCP> getListaMovCP() {
        if (listaMovCP == null){
            listaMovCP = new ArrayList<>();
        }
        return listaMovCP;
    }

    public void setListaMovCP(List<MovCP> listaMovCP) {
        this.listaMovCP = listaMovCP;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" + "id=" + id + ", numConto=" + numConto + ", cliente=" + cliente.getCodiceFiscale() + ", listaMovCC=" + listaMovCC + ", listaMovCD=" + listaMovCD + ", listaMovCP=" + listaMovCP + '}';
    }
    
}
