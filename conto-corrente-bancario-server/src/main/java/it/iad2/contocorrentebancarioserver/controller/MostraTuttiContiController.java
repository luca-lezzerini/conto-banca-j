package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.FiltroCognomeDto;
import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContiClienteDto;
import it.iad2.contocorrentebancarioserver.service.MostraTuttiContiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MostraTuttiContiController {

    @Autowired
    MostraTuttiContiService mostraContiService;

    @ResponseBody
    @RequestMapping("/cerca-cliente")
    public ListaClientiDto cercaCliente(@RequestBody FiltroCognomeDto dto) {
        return mostraContiService.cercaCliente(dto.getCognome());

    }

    @ResponseBody
    @RequestMapping("/carica-conti")
    public ListaContiClienteDto CaricaConti(@RequestBody ClienteDto dto) {
        return mostraContiService.CaricaConti(dto.getCliente());
    }
}
