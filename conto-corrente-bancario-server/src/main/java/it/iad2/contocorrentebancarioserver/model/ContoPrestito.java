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
public class ContoPrestito implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String codice;

    @JsonIgnoreProperties(value = "listaContiP", allowSetters = true, allowGetters = true)
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Cliente cliente;

//    @JsonIgnoreProperties(value = "contoP", allowSetters = true, allowGetters = true)
    @JsonIgnore
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "contoP")
    private List<MovCP> listaMovCP;

    public ContoPrestito() {
    }

    public ContoPrestito(String codice) {
        this.codice = codice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<MovCP> getListaMovCP() {
        if (listaMovCP == null) {
            listaMovCP = new ArrayList<>();
        }
        return listaMovCP;
    }

    public void setListaMovCP(List<MovCP> listaMovCP) {
        this.listaMovCP = listaMovCP;
    }

}
