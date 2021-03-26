package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCpDto;
import it.iad2.contocorrentebancarioserver.model.MovCP;
import java.util.List;

public interface MovimentaCPService {

    ListaMovCpDto cercaMov(String codice);

    List<MovCP> esegui(MovCP movimento);

}
