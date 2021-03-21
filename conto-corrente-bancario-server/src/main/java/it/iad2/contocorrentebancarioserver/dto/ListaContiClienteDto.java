package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;

public class ListaContiClienteDto {

    List<ContoCorrente> listaCC;
    List<ContoDeposito> listaCD;
    List<ContoPrestito> listaCP;

    public ListaContiClienteDto() {
    }

    public ListaContiClienteDto(List<ContoCorrente> listaCC, List<ContoDeposito> listaCD, List<ContoPrestito> listaCP) {
        this.listaCC = listaCC;
        this.listaCD = listaCD;
        this.listaCP = listaCP;
    }

    
    public List<ContoCorrente> getListaCC() {
        return listaCC;
    }

    public void setListaCC(List<ContoCorrente> listaCC) {
        this.listaCC = listaCC;
    }

    public List<ContoDeposito> getListaCD() {
        return listaCD;
    }

    public void setListaCD(List<ContoDeposito> listaCD) {
        this.listaCD = listaCD;
    }

    public List<ContoPrestito> getListaCP() {
        return listaCP;
    }

    public void setListaCP(List<ContoPrestito> listaCP) {
        this.listaCP = listaCP;
    }

    @Override
    public String toString() {
        return "ListaContiClienteDto{" + "listaCC=" + listaCC + ", listaCD=" + listaCD + ", listaCP=" + listaCP + '}';
    }
    

}
