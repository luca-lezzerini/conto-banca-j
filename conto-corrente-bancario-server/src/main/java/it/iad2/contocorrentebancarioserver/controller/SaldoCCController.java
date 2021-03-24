package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoCorrenteDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.SaldoCCDto;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.service.SaldoCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class SaldoCCController {
    @Autowired
    SaldoCCService saldoCCService;
    
    @RequestMapping("/ricerca-cc")
    @ResponseBody
    public ListaCCDto ricercaCC(@RequestBody ClienteDto dto) {
        return new ListaCCDto(saldoCCService.ricercaCC(dto.getCliente()));
    }
    
    @RequestMapping("/saldo-cc")
    @ResponseBody
    public SaldoCCDto saldoCC(@RequestBody ContoCorrenteDto dto) {
        return saldoCCService.saldoCC(dto.getConto().getNumConto());
    }
}
