package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.MovimentiCCDto;
import it.iad2.contocorrentebancarioserver.dto.NumCCDto;
import java.util.Date;

public interface MovimentaCCService {

    NumCCDto cerca(String n);

    MovimentiCCDto esegui(Date d, double i, String m,String c);

}
