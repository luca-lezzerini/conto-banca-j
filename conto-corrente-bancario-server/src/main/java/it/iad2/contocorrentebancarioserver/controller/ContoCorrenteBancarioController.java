package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.service.ContoCorrenteBancarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController

public class ContoCorrenteBancarioController {
    
    @Autowired
    ContoCorrenteBancarioService contoCorrenteBancarioService;
    
    
}
