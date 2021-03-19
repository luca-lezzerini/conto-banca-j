package it.iad2.contocorrentebancarioserver.controller;

import it.iad2.contocorrentebancarioserver.service.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class SystemAdminController {

    @Autowired
    SystemAdminService systemAdminService;

    @RequestMapping("/genera-dati-test")
    public void generaDatiTest() {
        systemAdminService.generaDatiTest();
    }
}
