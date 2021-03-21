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
    public ListaCPDto add(String stringa) {
        ContoPrestito contoPrestito = new ContoPrestito();
        contoPrestito.setCodice(stringa);
        contoPrestito = contoPrestitoRepository.save(contoPrestito);

        ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        return dtoLista;
    }

    @Override
    public ListaCPDto delete(String stringa) {
        ContoPrestito c = contoPrestitoRepository.findByCodice(stringa);
        contoPrestitoRepository.deleteById(c.getId());

        ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        return dtoLista;

    }

    @Override
    public ListaCPDto edit(ContoPrestito contoPrestito) {
        contoPrestito = contoPrestitoRepository.save(contoPrestito);

        ListaCPDto dtoLista = new ListaCPDto(contoPrestitoRepository.findAll());
        return dtoLista;

    }

    @Override
    public ListaCPDto aggiorna() {

        return new ListaCPDto(contoPrestitoRepository.findAll());

    }

}
