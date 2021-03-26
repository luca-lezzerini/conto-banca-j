package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.MovimentaCCDto;
import it.iad2.contocorrentebancarioserver.dto.MovimentiCCDto;
import it.iad2.contocorrentebancarioserver.dto.NumCCDto;
import it.iad2.contocorrentebancarioserver.service.MovimentaCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MovimentaCCController {

    @Autowired
    MovimentaCCService movimentaCcService;

    @RequestMapping("/cerca-conto")
    @ResponseBody
    NumCCDto cerca(@RequestBody NumCCDto dto) {
        return movimentaCcService.cerca(dto.getNumConto());
    }

    @RequestMapping("/esegui-movimento-cc")
    @ResponseBody
    MovimentiCCDto esegui(@RequestBody MovimentaCCDto dto) {
        return movimentaCcService.esegui(dto.getData(), dto.getImporto(), dto.getTipoMovCC(),dto.getCodice());
    }
@RequestMapping("/aggiorna-cc")
    @ResponseBody
    MovimentiCCDto aggiorna(@RequestBody NumCCDto dto){
        return movimentaCcService.aggiorna(dto.getNumConto());
    }
}
