package it.iad2.contocorrentebancarioserver.service;

import it.iad2.contocorrentebancarioserver.dto.SaldoCCDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import java.util.List;

public interface SaldoCCService {

    List<ContoCorrente> ricercaCC(Cliente cliente);

    SaldoCCDto saldoCC(String conto);
}
