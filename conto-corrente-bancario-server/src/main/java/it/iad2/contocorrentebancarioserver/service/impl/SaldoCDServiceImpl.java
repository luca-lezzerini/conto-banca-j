/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.SaldoCDDto;
import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.MovCD;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.service.SaldoCDService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matte
 */
@Service
public class SaldoCDServiceImpl implements SaldoCDService {

    @Autowired
    ContoDepositoRepository contoDepositoRepository;
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<ContoDeposito> ricercaCD(Cliente cliente) {
        return clienteRepository.findById(cliente.getId()).get().getListaContiD();
    }

    @Override
    public SaldoCDDto saldoCD(String conto) {
        double saldo = 0;

        List<ContoDeposito> cd = contoDepositoRepository.findByCodice(conto).getCliente().getListaContiD();
        List<MovCD> mov = contoDepositoRepository.findByCodice(conto).getListaMovCD();
        for (MovCD movCD : mov) {
            if (movCD.getTipoMov().equalsIgnoreCase("versamento")) {
                saldo += movCD.getImportoMov();
            } else if (movCD.getTipoMov().equalsIgnoreCase("prelievo")) {
                saldo -= movCD.getImportoMov();}
        }
        return new SaldoCDDto(saldo, cd);
    }

}
