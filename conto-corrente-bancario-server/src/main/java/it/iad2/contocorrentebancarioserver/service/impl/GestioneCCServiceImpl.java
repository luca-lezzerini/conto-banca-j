/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
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

    @Override
    public List<ContoCorrente> nuovo(String numConto) {
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
    public List<ContoCorrente> aggiungi() {
        //TO DO 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
