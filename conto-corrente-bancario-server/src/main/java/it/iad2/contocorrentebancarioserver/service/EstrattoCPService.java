package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCpDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;

public interface EstrattoCPService {

    ListaClientiDto cercaCliente(String cognome);

    ListaContoPrestitoDto caricaConti(Cliente cliente);
    
    ListaMovCpDto estrattoContoCp (ContoPrestito cp);
}
