/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.service.GestioneCDService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class GestioneCDServiceImpl implements GestioneCDService{
    
    @Autowired
    ContoDepositoRepository contoDepositoRepository;
    

    @Override
    public List<ContoDeposito> aggiungi(String codice) {
        ContoDeposito conto = new ContoDeposito();
        conto.setCodice(codice);
        contoDepositoRepository.save(conto);
        return aggiorna();
    }

    @Override
    public List<ContoDeposito> aggiorna() {
       return contoDepositoRepository.findAll();
    }

    @Override
    public List<ContoDeposito> elimina(ContoDeposito conto) {
        contoDepositoRepository.delete(conto);
        return aggiorna();
    }

    @Override
    public List<ContoDeposito> modifica(ContoDeposito conto, String nuovoContoDeposito) {
        conto.setCodice(nuovoContoDeposito);
        contoDepositoRepository.save(conto);
        return aggiorna();
    }
    
}
