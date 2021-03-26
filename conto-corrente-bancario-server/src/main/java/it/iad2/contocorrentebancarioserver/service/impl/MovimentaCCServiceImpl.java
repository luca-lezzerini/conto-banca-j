package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.dto.MovimentiCCDto;
import it.iad2.contocorrentebancarioserver.dto.NumCCDto;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.MovCC;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCCRepository;
import it.iad2.contocorrentebancarioserver.service.MovimentaCCService;
import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentaCCServiceImpl implements MovimentaCCService {

    @Autowired
    ContoCorrenteRepository contoCRepository;
    @Autowired
    MovCCRepository movCcRepository;

    @Override
    public NumCCDto cerca(String n) {
        ContoCorrente cc = contoCRepository.findByNumConto(n);
        NumCCDto dto = new NumCCDto();
        if (cc == null) {
            cc = new ContoCorrente();
            cc.setNumConto("Codice Errato");
        }
        dto.setNumConto(cc.getNumConto());

        return dto;
    }

    @Override
    public MovimentiCCDto esegui(Date d, double i, String tipoMovimento, String codiceConto) {
        ContoCorrente cc = contoCRepository.findByNumConto(codiceConto);
        MovCC mov = new MovCC();
        mov.setDataMov(LocalDate.now());
        mov.setTipoMov(tipoMovimento);
        mov.setContoC(cc);
        mov.setImportoMov(i);
        movCcRepository.save(mov);
        return new MovimentiCCDto(movCcRepository.findAll());
    }
//    public MovimentiCCDto esegui(Date d, double i, String tipoM, String c) {
//        ContoCorrente cc = contoCRepository.findByNumConto(c);
//
//        MovCC mov = new MovCC();
//        mov.setDataMov(LocalDate.now());
//        mov.setContoC(cc);
//        mov.setImportoMov(i);
//        switch (tipoM) {
//            case "versamento" ->
//                mov.setTipoMov(tipoM);
//            case "prelievo" ->
//                mov.setTipoMov(tipoM);
//            case "bonifico" ->
//                mov.setTipoMov(tipoM);
//        }
//
//        movCcRepository.save(mov);
//        return aggiorna(c);
//                
//    }

    @Override
    public MovimentiCCDto aggiorna(String numConto) {
        ContoCorrente cc = contoCRepository.findByNumConto(numConto);
        if (cc == null) {
            cc = new ContoCorrente();
        }
        return new MovimentiCCDto(movCcRepository.findByContoC(cc.getId()));

    }
}
