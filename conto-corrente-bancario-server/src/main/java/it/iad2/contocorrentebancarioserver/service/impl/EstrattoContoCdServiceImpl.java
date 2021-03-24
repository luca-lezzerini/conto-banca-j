/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.ListaCDDto;
import it.iad2.contocorrentebancarioserver.dto.ListaMovCDDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.MovCD;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.service.EstrattoContoCDService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matte
 */
@Service
public class EstrattoContoCdServiceImpl implements EstrattoContoCDService {

    @Autowired
    ContoDepositoRepository contoCDRepository;
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ListaCDDto mostraContiCD(Cliente cliente) {
        cliente = clienteRepository.findById(cliente.getId()).get();
        List<ContoDeposito> listaCD = cliente.getListaContiD();
        return new ListaCDDto(listaCD);
    }

    @Override
    public ListaMovCDDto mostraMovCD(ContoDeposito contoCD) {
        contoCD = contoCDRepository.findById(contoCD.getId()).get();
        List<MovCD> movCD = contoCD.getListaMovCD();
        return new ListaMovCDDto(movCD);
    }

}
