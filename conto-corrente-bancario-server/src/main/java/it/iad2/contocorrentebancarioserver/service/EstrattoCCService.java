package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCCDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;

public interface EstrattoCCService {
    
    ListaCCDto mostraContiCC(Cliente cliente);
    
    ListaMovCCDto mostraMovCC(ContoCorrente contoCC);
    
}
