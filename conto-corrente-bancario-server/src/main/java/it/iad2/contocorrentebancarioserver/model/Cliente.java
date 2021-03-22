package it.iad2.contocorrentebancarioserver.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {
 
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String nome;
    
    @Column
    private String cognome;
    
    @Column
    private String codiceFiscale;
    
    @Column
    private String indirizzo;
    
    @Column
    private String telefono;
    
    @Column
    private LocalDate dataNascita;
    
    @JsonIgnoreProperties(value = "cliente", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "cliente")
    private List<ContoCorrente> listaContiC;
    
    @JsonIgnoreProperties(value = "cliente", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "cliente")
    private List<ContoDeposito> listaContiD;
    
    @JsonIgnoreProperties(value = "cliente", allowSetters = true, allowGetters = true)
    @OneToMany (cascade = CascadeType.REMOVE ,mappedBy = "cliente")
    private List<ContoPrestito> listaContiP;

    public Cliente() {
    }

    public Cliente(String nome, String cognome, String codiceFiscale, String indirizzo, String telefono, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.dataNascita = dataNascita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public List<ContoCorrente> getListaContiC() {
        if (listaContiC == null){
            listaContiC = new ArrayList<>();
        }
        return listaContiC;
    }

    public void setListaContiC(List<ContoCorrente> listaContiC) {
        this.listaContiC = listaContiC;
    }

    public List<ContoDeposito> getListaContiD() {
        if (listaContiD == null){
            listaContiD = new ArrayList<>();
        }
        return listaContiD;
    }

    public void setListaContiD(List<ContoDeposito> listaContiD) {
        this.listaContiD = listaContiD;
    }

    public List<ContoPrestito> getListaContiP() {
        if (listaContiP == null){
            listaContiP = new ArrayList<>();
        }
        return listaContiP;
    }

    public void setListaContiP(List<ContoPrestito> listaContiP) {
        this.listaContiP = listaContiP;
    }
    
    
    
}
