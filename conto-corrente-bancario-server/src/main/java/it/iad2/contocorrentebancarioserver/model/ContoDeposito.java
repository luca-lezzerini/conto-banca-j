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
public class ContoDeposito {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String codice;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Cliente cliente;
    
    @OneToMany (mappedBy = "contoD")
    private List<MovCD> listaMovCD;

    public ContoDeposito() {
    }

    public ContoDeposito(String codice) {
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

    public List<MovCD> getListaMovCD() {
        if (listaMovCD == null){
            listaMovCD = new ArrayList<>();
        }
        return listaMovCD;
    }

    public void setListaMovCD(List<MovCD> listaMovCD) {
        this.listaMovCD = listaMovCD;
    }
    
    
}
