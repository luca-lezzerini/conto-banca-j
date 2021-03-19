package it.iad2.contocorrentebancarioserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContoCorrente {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String numConto;

    public ContoCorrente() {
    }

    public ContoCorrente(Long id, String codice) {
        this.id = id;
        this.numConto = codice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return numConto;
    }

    public void setCodice(String codice) {
        this.numConto = codice;
    }
    
    
}
