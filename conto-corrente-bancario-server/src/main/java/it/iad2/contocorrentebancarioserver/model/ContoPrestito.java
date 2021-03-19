package it.iad2.contocorrentebancarioserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContoPrestito {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String codice;

    public ContoPrestito() {
    }

    public ContoPrestito(Long id, String codice) {
        this.id = id;
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
    
    
}
