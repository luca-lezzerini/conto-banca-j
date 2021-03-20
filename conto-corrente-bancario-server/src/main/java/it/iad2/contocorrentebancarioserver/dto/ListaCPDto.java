
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;


public class ListaCPDto {
   private List<ContoPrestito> listaCodici;

    public ListaCPDto() {
    }

    public ListaCPDto(List<ContoPrestito> listaCodici) {
        this.listaCodici = listaCodici;
    }

    public List<ContoPrestito> getListaCodici() {
        return listaCodici;
    }

    public void setListaCodici(List<ContoPrestito> listaCodici) {
        this.listaCodici = listaCodici;
    }

    @Override
    public String toString() {
        return "ListaCPDto{" + "listaCodici=" + listaCodici + '}';
    }
    
            
    
}
