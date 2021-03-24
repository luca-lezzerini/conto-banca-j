package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoCorrenteDto;
import it.iad2.contocorrentebancarioserver.dto.FiltroCognomeDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCCDto;
import it.iad2.contocorrentebancarioserver.service.EstrattoCCService;
import it.iad2.contocorrentebancarioserver.service.GestioneClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EstrattoCCController {
    @Autowired
    GestioneClientiService gestioneClientiService;
    
    @Autowired
    EstrattoCCService estrattoCCService;
    
    @RequestMapping("/cerca-cliente-cc")
    @ResponseBody
    ListaClientiDto mostraClienti(@RequestBody FiltroCognomeDto dto){
        return gestioneClientiService.ricercaLike(dto.getCognome());
    }
    
    @RequestMapping("/mostra-cc-cliente")
    @ResponseBody
    ListaCCDto mostraCCCliente(@RequestBody ClienteDto dto){
        return estrattoCCService.mostraContiCC(dto.getCliente());
    }
    
    @RequestMapping("/mostra-ec-cc")
    @ResponseBody
    ListaMovCCDto mostraEcCC(@RequestBody ContoCorrenteDto dto){
        return estrattoCCService.mostraMovCC(dto.getConto());
    }
    
}
