package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;

public interface EstrattoCPService {

    ListaClientiDto cercaCliente(String cognome);
    ListaContoPrestitoDto CaricaConti(Cliente cliente);
    
}
