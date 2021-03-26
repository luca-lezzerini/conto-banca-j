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
    MovCCRepository movCcReository;

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
    public MovimentiCCDto esegui(Date d, double i, String m, String c) {
        ContoCorrente cc = contoCRepository.findByNumConto(c);
        MovCC mov = new MovCC();
        mov.setDataMov(LocalDate.now());
        mov.setTipoMov(m);
        mov.setContoC(cc);
        mov.setImportoMov(i);
        movCcReository.save(mov);
        return new MovimentiCCDto(movCcReository.findAll());
    }

}
