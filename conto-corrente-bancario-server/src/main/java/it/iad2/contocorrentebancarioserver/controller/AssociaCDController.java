package it.iad2.contocorrentebancarioserver.controller;


import it.iad2.contocorrentebancarioserver.dto.AssociaCDDto;
import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
import it.iad2.contocorrentebancarioserver.dto.NumCDDto;
import it.iad2.contocorrentebancarioserver.service.AssociaCDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class AssociaCDController {


    @Autowired
    AssociaCDService associaCDService;
   

    @RequestMapping("/associa-cd")
    @ResponseBody
    public void associaCD(@RequestBody AssociaCDDto dto){
        associaCDService.associaCD(dto.getCliente(), dto.getConto());
    }
    @RequestMapping("/cerca-conto-deposito")
    @ResponseBody
    public ContoDepositoDto cercaCD(@RequestBody NumCDDto dto){
        ContoDepositoDto dtr = new ContoDepositoDto();
        dtr.setConto(associaCDService.trovaConto(dto.getCodice()));
        return dtr;
    }
}
