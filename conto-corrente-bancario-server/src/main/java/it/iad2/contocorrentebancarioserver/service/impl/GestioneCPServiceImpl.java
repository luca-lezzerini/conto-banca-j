package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaCPDto;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.service.GestioneCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestioneCPServiceImpl implements GestioneCPService {

    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Override
    public ListaCPDto add(ContoPrestito contoPrestito) {

        contoPrestito = contoPrestitoRepository.save(contoPrestito);

        ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        
        return dtoLista;
    }

    @Override
    public ListaCPDto delete(ContoPrestito c) {
        
         contoPrestitoRepository.delete(c);
        
         ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        
        return dtoLista;
        
        
    }

    @Override
    public ListaCPDto edit(ContoPrestito c) {
        
     c =  contoPrestitoRepository.save(c);

        ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        
        return dtoLista;
        
    }

    @Override
    public ListaCPDto aggiorna() {
        
        return new ListaCPDto(contoPrestitoRepository.findAll()); 
        
    }

}
