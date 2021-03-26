/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.dto.CriterioCPDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCpDto;
import it.iad2.contocorrentebancarioserver.dto.MovimentaCPDto;
import it.iad2.contocorrentebancarioserver.service.MovimentaCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MovimentaCPController {

    @Autowired
    MovimentaCPService movCpService;

    @ResponseBody
    @RequestMapping("/cerca-mov-cp")
    public ListaMovCpDto cercaMovCP(@RequestBody CriterioCPDto dto) {
        ListaMovCpDto risp = new ListaMovCpDto(movCpService.cercaMovCP(dto.getRicerca()));
        return risp;
    }

    @ResponseBody
    @RequestMapping("/esegui-mov-cp")
    public ListaMovCpDto eseguiMovCp(@RequestBody MovimentaCPDto dto) {
        return new ListaMovCpDto(movCpService.esegui(dto.getMovCP()));
    }

}
