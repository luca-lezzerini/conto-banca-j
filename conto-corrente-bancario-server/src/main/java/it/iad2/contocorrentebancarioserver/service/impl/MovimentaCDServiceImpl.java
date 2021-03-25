package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.MovCD;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCDRepository;
import it.iad2.contocorrentebancarioserver.service.MovimentaCDService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentaCDServiceImpl implements MovimentaCDService {

    @Autowired
    MovCDRepository movCDRepository;
    @Autowired
    ContoDepositoRepository contoDepositoRepository;

    @Override
    public void eseguiMovimento(ContoDeposito conto, String tipoMovimento, Double importo) {
        MovCD movCD = new MovCD();
        movCD.setContoD(conto);
        movCD.setImportoMov(importo);
        movCD.setDataMov(LocalDate.now());
        switch (tipoMovimento) {
            case "deposito":
                movCD.setTipoMov(tipoMovimento);
                break;
            case "riscatto":
                movCD.setTipoMov(tipoMovimento);
                break;
        }
        movCDRepository.save(movCD);
    }

    @Override
    public List<MovCD> mostraMovimentiConto(ContoDeposito conto) {
        conto = contoDepositoRepository.findById(conto.getId()).get();
        List<MovCD> movCD = conto.getListaMovCD();
        return movCD;
    }

}
