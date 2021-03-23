package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.MovCP;
import java.util.List;

public class ListaMovCpDto {
    List<MovCP> listaMovCp;

    public ListaMovCpDto() {
    }

    public ListaMovCpDto(List<MovCP> listaMovCp) {
        this.listaMovCp = listaMovCp;
    }

    public List<MovCP> getListaMovCp() {
        return listaMovCp;
    }

    public void setListaMovCp(List<MovCP> listaMovCp) {
        this.listaMovCp = listaMovCp;
    }

    @Override
    public String toString() {
        return "ListaMovCpDto{" + "listaMovCp=" + listaMovCp + '}';
    }
    
    
    
}
