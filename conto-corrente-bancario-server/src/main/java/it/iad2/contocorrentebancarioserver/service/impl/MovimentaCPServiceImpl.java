/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCpDto;
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
public class MovimentaCPServiceImpl implements MovimentaCPService {

    @Autowired
    MovCPRepository movCpRepository;

    @Autowired
    ContoPrestitoRepository contoCpRepository;

    @Override
    public ListaMovCpDto cercaMov(String codice) {
        System.out.println("\n\nCercaMov codice: " + codice);
        List<ContoPrestito> lista = contoCpRepository.findByCodiceEquals(codice);
        System.out.println("Lista = " + lista);
        ContoPrestito c = lista.get(0);
        System.out.println("\nConto Prestito: " + c.getListaMovCP());
        System.out.println("\nConto Prestito id: " + c.getId());
        System.out.println("Lista mov cp " + c.getListaMovCP());
        ListaMovCpDto risp = new ListaMovCpDto(c.getListaMovCP());
        return risp;
    }

    @Override
    public List<MovCP> esegui(MovCP movimento) {
        MovCP movCp = new MovCP();
        movCp.setDataMov(LocalDate.now());
        movCp.setImportoMov(movimento.getImportoMov());
        switch (movimento.getTipoMov()) {
            case "CONCESSIONE":
                movCp.setTipoMov(movimento.getTipoMov());
                break;
            case "EROGAZIONE":
                movCp.setTipoMov(movimento.getTipoMov());
                break;
            case "RIMBORSO":
                movCp.setTipoMov(movimento.getTipoMov());
                break;
        }
        movCpRepository.save(movCp);
        return movCpRepository.findAll();
    }
}
