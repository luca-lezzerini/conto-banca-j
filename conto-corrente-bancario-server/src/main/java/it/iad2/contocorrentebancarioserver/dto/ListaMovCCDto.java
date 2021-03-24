package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.MovCC;
import java.util.List;

public class ListaMovCCDto {
    
    private List<MovCC> listaMov; 

    public ListaMovCCDto() {
    }

    public ListaMovCCDto(List<MovCC> listaMov) {
        this.listaMov = listaMov;
    }

    public List<MovCC> getListaMov() {
        return listaMov;
    }

    public void setListaMov(List<MovCC> listaMov) {
        this.listaMov = listaMov;
    }
    
}
