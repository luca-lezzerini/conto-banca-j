package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.dto.ListaCCDto;
import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;
import it.iad2.contocorrentebancarioserver.dto.NumCPDto;
import it.iad2.contocorrentebancarioserver.service.GestioneCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class GestioneCPController {

    @Autowired
    GestioneCPService cpService;

    @ResponseBody
    @RequestMapping("/add")
    public ListaCPDto add(@RequestBody NumCPDto dto) {
        return cpService.add(dto.getContoprestito());
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ListaCPDto edit(@RequestBody NumCPDto dto) {
        return cpService.edit(dto.getContoprestito());
    }

    @ResponseBody
    @RequestMapping("/delete")
    public ListaCPDto delete(@RequestBody NumCPDto dto) {
        return cpService.delete(dto.getContoprestito());
    }
}
