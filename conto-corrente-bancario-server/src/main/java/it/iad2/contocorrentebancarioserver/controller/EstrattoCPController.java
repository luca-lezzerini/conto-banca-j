package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.FiltroCognomeDto;
import it.iad2.contocorrentebancarioserver.dto.ListaClientiDto;
import it.iad2.contocorrentebancarioserver.dto.ListaContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.service.EstrattoCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class EstrattoCPController {

    @Autowired
    EstrattoCPService estrattoCPService;

    @ResponseBody
    @RequestMapping("/cerca-cliente-cp")

    public ListaClientiDto cercaCliente(@RequestBody FiltroCognomeDto dto) {
        return estrattoCPService.cercaCliente(dto.getCognome());
    }

    @ResponseBody
    @RequestMapping("/mostra-conti-cp")

    public ListaContoPrestitoDto CaricaConti(@RequestBody ClienteDto dto) {
        return estrattoCPService.CaricaConti(dto.getCliente());
    }
}