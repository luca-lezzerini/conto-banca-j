package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import java.util.List;

public class ListaClientiDto {
    
    private List<Cliente> listaClienti; 

    public ListaClientiDto() {
    }

    public ListaClientiDto(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }

    public List<Cliente> getListaClienti() {
        return listaClienti;
    }

    public void setListaClienti(List<Cliente> listaClienti) {
        this.listaClienti = listaClienti;
    }
    
}
