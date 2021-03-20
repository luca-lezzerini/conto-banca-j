/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ContoCorrenteDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.NumCCDto;
import it.iad2.contocorrentebancarioserver.service.GestioneCCService;
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
public class GestioneCCController {

    @Autowired
    GestioneCCService gestioneCCService;

    @RequestMapping("/new")
    @ResponseBody
    public ListaCCDto nuovoCC(@RequestBody NumCCDto dto) {
        return new ListaCCDto(gestioneCCService.nuovo(dto.getNumConto()));
    }

    @RequestMapping("/aggiorna-lista")
    @ResponseBody
    public ListaCCDto aggiorna() {
        return new ListaCCDto(gestioneCCService.aggiorna());
    }
    
    @RequestMapping("/aggiungi")
    @ResponseBody
    public ListaCCDto aggiungi() {
        // TO DO
        return new ListaCCDto(gestioneCCService.aggiungi());
    }
    @RequestMapping("/elimina")
    @ResponseBody
    public ListaCCDto elimina(@RequestBody ContoCorrenteDto dto) {
        return new ListaCCDto(gestioneCCService.elimina(dto.getConto()));
    }
}
