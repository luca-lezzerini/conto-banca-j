/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCDDto;
import it.iad2.contocorrentebancarioserver.dto.ModificaCDDto;
import it.iad2.contocorrentebancarioserver.dto.NumCDDto;
import it.iad2.contocorrentebancarioserver.service.GestioneCDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */
@CrossOrigin("*")
@RestController
public class GestioneCDController {
    
    @Autowired
    GestioneCDService gestioneCDService;
    
    
    @RequestMapping("/new-cd")
    @ResponseBody
    public ListaCDDto nuovoCC(@RequestBody NumCDDto dto) {
        return new ListaCDDto(gestioneCDService.aggiungi(dto.getCodice()));
    }

    @RequestMapping("/aggiorna-lista-cd")
    @ResponseBody
    public ListaCDDto aggiorna() {
        return new ListaCDDto(gestioneCDService.aggiorna());
    }

    @RequestMapping("/elimina-cd")
    @ResponseBody
    public ListaCDDto elimina(@RequestBody ContoDepositoDto dto) {
        return new ListaCDDto(gestioneCDService.elimina(dto.getConto()));
    }

    @RequestMapping("/modifica-cd")
    @ResponseBody
    public ListaCDDto modifica(@RequestBody ModificaCDDto dto) {
        return new ListaCDDto(gestioneCDService.modifica(dto.getConto(), dto.getNuovoNumeroConto()));
    }
    
    
}
