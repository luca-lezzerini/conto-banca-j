/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ContoPrestitoDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.service.AssociaCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class AssociaCPServiceImpl implements AssociaCPService{
    
    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;

    @Override
    public void associaCP(Cliente cliente, ContoPrestito conto) {
        conto.setCliente(cliente);
        contoPrestitoRepository.save(conto);
    }

    @Override
    public ContoPrestitoDto cercaCP(String codice) {
        return new ContoPrestitoDto(contoPrestitoRepository.findByCodiceEquals(codice).get(0));
    }
}
