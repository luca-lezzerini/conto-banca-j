package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.service.AssociaCDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociaCDServiceImpl implements AssociaCDService {

    @Autowired
    ContoDepositoRepository contoDepositoRepository;

    @Override
    public void associaCD(Cliente cliente, ContoDeposito conto) {
        conto.setCliente(cliente);
        contoDepositoRepository.save(conto);
    }

    @Override
    public ContoDeposito trovaConto(String codice) {
        ContoDeposito c = new ContoDeposito();
        if (c == null) {
            return new ContoDeposito();
        } else {
            return c;
        }
    }
}
