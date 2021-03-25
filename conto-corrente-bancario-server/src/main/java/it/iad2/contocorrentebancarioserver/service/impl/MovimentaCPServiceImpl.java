/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.TipoMovimentoCP;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.model.MovCP;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCPRepository;
import it.iad2.contocorrentebancarioserver.service.MovimentaCPService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentaCPServiceImpl implements MovimentaCPService{
    
    @Autowired
    MovCPRepository movCpRepository;
    
    @Autowired
    ContoPrestitoRepository contoCpRepository;

    @Override
    public List<MovCP> cercaMov(String codice) {
        System.out.println("\n\nCercaMov codice: " + codice);
        ContoPrestito c = contoCpRepository.findByCodiceEquals(codice).get(0);
        System.out.println("\nConto Prestito: " + c.getListaMovCP());
        System.out.println("\nConto Prestito id: " + c.getId());
        return c.getListaMovCP();
    }

    @Override
    public List<MovCP> esegui(MovCP movimento) {
        MovCP movCp = new MovCP();
        movCp.setDataMov(LocalDate.now());
        movCp.setImportoMov(movimento.getImportoMov());
        movCp.setTipoMov(movimento.getTipoMov());
        movCpRepository.save(movCp);
        return aggiorna();
    }
    
    @Override
    public List<MovCP> aggiorna(){
        return movCpRepository.findAll();
    }
    
    
}
