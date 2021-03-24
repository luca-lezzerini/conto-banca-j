package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ClienteDto;
import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;
import it.iad2.contocorrentebancarioserver.dto.SaldoCPDto;
import it.iad2.contocorrentebancarioserver.service.SaldoCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class SaldoCPController {

    @Autowired
    SaldoCPService saldoCPService;

    @RequestMapping("/ricerca-cp")
    @ResponseBody
    public ListaCPDto ricercaCC(@RequestBody ClienteDto dto) {
        return new ListaCPDto(saldoCPService.ricercaCP(dto.getCliente()));
    }

    @RequestMapping("/saldo-cp")
    @ResponseBody
    public SaldoCPDto saldoCC(@RequestBody ContoPrestitoDto dto) {
        return saldoCPService.saldoCP(dto.getContoPrestito().getCodice());
    }

}
