package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.SaldoCPDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;


public interface SaldoCPService {
    
    List<ContoPrestito> ricercaCP(Cliente cliente);

    SaldoCPDto saldoCP(String conto);
    
}
