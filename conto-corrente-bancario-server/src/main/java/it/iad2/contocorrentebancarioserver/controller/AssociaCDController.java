package it.iad2.contocorrentebancarioserver.controller;


import it.iad2.contocorrentebancarioserver.dto.ContoDepositoDto;
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
    public void associaCD(@RequestBody ContoDepositoDto dto){
        associaCDService.associaCD(dto.getConto().getCliente(), dto.getConto());
    }
}
