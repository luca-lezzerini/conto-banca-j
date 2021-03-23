/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.service.AssociaCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@CrossOrigin("*")
@RestController
public class AssociaCPController {
    
    @Autowired
    AssociaCPService associaCpService;
    
    @RequestMapping("/associa-cp")
    @ResponseBody
    public void associaCP(@RequestBody ContoPrestitoDto dto){
        associaCpService.associaCP(dto.getContoPrestito().getCliente(), dto.getContoPrestito());
    }
}
