
package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.model.MovCP;
import java.util.List;

public interface MovimentaCPService {
    
    List<MovCP> cercaMov(String codice);
    
    List<MovCP> esegui(MovCP movimento);
    
    List<MovCP> aggiorna();
}
