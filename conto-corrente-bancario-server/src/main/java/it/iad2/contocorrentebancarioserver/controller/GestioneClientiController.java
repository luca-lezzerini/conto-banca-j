package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.service.GestioneClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class GestioneClientiController {

    @Autowired
    GestioneClientiService gestioneClientiService;

    @RequestMapping("/aggiungi-cliente")
    @ResponseBody
    public ListaClientiDto aggiungi(@RequestBody ClienteDto dto) {
        return gestioneClientiService.aggiungi(dto.getCliente());
    }

    @RequestMapping("/modifica-cliente")
    @ResponseBody
    public ListaClientiDto modifica(@RequestBody ClienteDto dto) {
        return gestioneClientiService.modifica(dto.getCliente());
    }

    @RequestMapping("/cancella-cliente")
    @ResponseBody
    public ListaClientiDto cancella(@RequestBody ClienteDto dto) {
        return gestioneClientiService.cancella(dto.getCliente());
    }

    @RequestMapping("/aggiorna-cliente")
    @ResponseBody
    public ListaClientiDto aggiorna() {
        return gestioneClientiService.aggiorna();
    }

}
