/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCDDto;
import it.iad2.contocorrentebancarioserver.dto.SaldoCDDto;
import it.iad2.contocorrentebancarioserver.service.SaldoCDService;
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
@CrossOrigin("*")
@RestController
public class SaldoCDController {

    @Autowired
    SaldoCDService saldoCDService;
    
    @RequestMapping("/ricerca-cd")
    @ResponseBody
    public ListaCDDto ricercaCD(@RequestBody ClienteDto dto){
    return new ListaCDDto(saldoCDService.ricercaCD(dto.getCliente()));
    }
    @RequestMapping("saldo-cd")
    @ResponseBody
    public SaldoCDDto saldoCD(@RequestBody ContoDepositoDto dto){
        return saldoCDService.saldoCD(dto.getConto().getCodice());
    }

}
