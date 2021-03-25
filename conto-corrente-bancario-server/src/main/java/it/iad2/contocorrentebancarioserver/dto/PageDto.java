package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import org.springframework.data.domain.Page;


public class PageDto {
    
    Page<Cliente> listaCliPag;

    public PageDto() {
    }

    public PageDto(Page<Cliente> listaCliPag) {
        this.listaCliPag = listaCliPag;
    }

    public Page<Cliente> getListaCliPag() {
        return listaCliPag;
    }

    public void setListaCliPag(Page<Cliente> listaCliPag) {
        this.listaCliPag = listaCliPag;
    }
}
