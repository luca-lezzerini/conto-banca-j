package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCDDto;
import it.iad2.contocorrentebancarioserver.dto.MovimentaCDDto;
import it.iad2.contocorrentebancarioserver.service.MovimentaCDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class MovimentaCDController {

    @Autowired
    MovimentaCDService movimentaCDService;

    @ResponseBody
    @RequestMapping("/esegui-movimento-cd")
    public void eseguiMovimento(@RequestBody MovimentaCDDto dto){
        movimentaCDService.eseguiMovimento(dto.getConto(),dto.getTipoMovimento(),dto.getImporto());
    }
    @ResponseBody
    @RequestMapping("/mostra-movimenti-conto-cd")
    public ListaMovCDDto mostraMovimentiCD(@RequestBody ContoDepositoDto dto){
        ListaMovCDDto dtoR = new ListaMovCDDto();
        dtoR.setListaMovCD(movimentaCDService.mostraMovimentiConto(dto.getConto()));
        return dtoR;
    }
}
