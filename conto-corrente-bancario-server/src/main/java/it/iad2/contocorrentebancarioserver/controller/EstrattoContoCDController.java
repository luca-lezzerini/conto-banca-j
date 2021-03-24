/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
import it.iad2.contocorrentebancarioserver.dto.FiltroCognomeDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCDDto;
import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCDDto;
import it.iad2.contocorrentebancarioserver.service.EstrattoContoCDService;
import it.iad2.contocorrentebancarioserver.service.GestioneClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matte
 */
@RestController
@CrossOrigin("*")
public class EstrattoContoCDController {

    @Autowired
    GestioneClientiService gestioneClientiService;

    @Autowired
    EstrattoContoCDService estrattoContoCDService;

    @RequestMapping("/cerca-cliente-cd")
    @ResponseBody
    ListaClientiDto mostraClienti(@RequestBody FiltroCognomeDto dto) {
        return gestioneClientiService.ricercaLike(dto.getCognome());
    }

    @RequestMapping("/mostra-cd-cliente")
    @ResponseBody
    ListaCDDto mostraCCDliente(@RequestBody ClienteDto dto) {
        return estrattoContoCDService.mostraContiCD(dto.getCliente());
    }

    @RequestMapping("/mostra-ec-cd")
    @ResponseBody
    ListaMovCDDto mostraEcCD(@RequestBody ContoDepositoDto dto) {
        return estrattoContoCDService.mostraMovCD(dto.getConto());
    }

}
