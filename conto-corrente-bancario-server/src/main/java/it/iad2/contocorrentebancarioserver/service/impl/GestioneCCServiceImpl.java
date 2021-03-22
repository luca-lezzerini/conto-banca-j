/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCCRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCDRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCPRepository;
import it.iad2.contocorrentebancarioserver.service.GestioneCCService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class GestioneCCServiceImpl implements GestioneCCService {

    @Autowired
    ContoCorrenteRepository contoCorrenteRepository;
    @Autowired
    MovCCRepository movCCRepository;
    @Autowired
    MovCDRepository movCDRepository;
    @Autowired
    MovCPRepository movCPRepository;
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ContoCorrente> aggiungi(String numConto) {
        ContoCorrente conto = new ContoCorrente();
        conto.setNumConto(numConto);
        contoCorrenteRepository.save(conto);
        return aggiorna();
    }

    @Override
    public List<ContoCorrente> aggiorna() {
        return contoCorrenteRepository.findAll();
    }

    @Override
    public List<ContoCorrente> elimina(ContoCorrente conto) {
        contoCorrenteRepository.delete(conto);
        return aggiorna();
    }

    @Override
    public List<ContoCorrente> modifica(ContoCorrente conto, String nuovoContoCorrente) {
        conto.setNumConto(nuovoContoCorrente);
        contoCorrenteRepository.save(conto);
        return aggiorna();
    }

}
