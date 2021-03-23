package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.AssociaCCDto;
import it.iad2.contocorrentebancarioserver.dto.ContoCorrenteDto;
import it.iad2.contocorrentebancarioserver.dto.MessaggioDto;
import it.iad2.contocorrentebancarioserver.dto.NumCCDto;
import it.iad2.contocorrentebancarioserver.service.AssociaCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class AssociaCCController {

    @Autowired
    AssociaCCService associaCCService;

    @RequestMapping("/cerca-cc-equals")
    @ResponseBody
    public ContoCorrenteDto cercaCCEquals(@RequestBody NumCCDto dto) {
        return new ContoCorrenteDto(associaCCService.cercaCCEquals(dto.getNumConto()));
    }

    @RequestMapping("/associa-cc")
    @ResponseBody
    public MessaggioDto associaCC(@RequestBody AssociaCCDto dto) {
        return new MessaggioDto(associaCCService.associaCC(dto.getCliente(), dto.getContoCorrente()));

    }

}
