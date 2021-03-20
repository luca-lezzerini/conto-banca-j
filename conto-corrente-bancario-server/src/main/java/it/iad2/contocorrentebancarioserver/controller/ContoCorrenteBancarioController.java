package it.iad2.contocorrentebancarioserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import it.iad2.contocorrentebancarioserver.service.ContoCorrenteBancarioService;

@CrossOrigin("*")
@RestController

public class ContoCorrenteBancarioController {
    
    @Autowired
    ContoCorrenteBancarioService contoCorrenteBancarioService;
    
    
}
