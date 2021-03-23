package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;

public class ListaContoPrestitoDto {

    List<ContoPrestito> listaContoPrestito;

    public ListaContoPrestitoDto() {
    }

    public ListaContoPrestitoDto(List<ContoPrestito> listaContoPrestito) {
        this.listaContoPrestito = listaContoPrestito;
    }

    public List<ContoPrestito> getListaContoPrestito() {
        return listaContoPrestito;
    }

    public void setListaContoPrestito(List<ContoPrestito> listaContoPrestito) {
        this.listaContoPrestito = listaContoPrestito;
    }
}
