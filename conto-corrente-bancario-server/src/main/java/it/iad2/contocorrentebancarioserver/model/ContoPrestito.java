package it.iad2.contocorrentebancarioserver.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ContoPrestito {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String codice;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Cliente cliente;
    
    @OneToMany (mappedBy = "contoP")
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
        if (listaMovCP == null){
            listaMovCP = new ArrayList<>();
        }
        return listaMovCP;
    }

    public void setListaMovCP(List<MovCP> listaMovCP) {
        this.listaMovCP = listaMovCP;
    }
    
    
}
