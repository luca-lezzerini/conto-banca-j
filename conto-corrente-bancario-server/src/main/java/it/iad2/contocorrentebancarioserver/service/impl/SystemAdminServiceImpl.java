package it.iad2.contocorrentebancarioserver.service.impl;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import it.iad2.contocorrentebancarioserver.model.MovCC;
import it.iad2.contocorrentebancarioserver.model.MovCD;
import it.iad2.contocorrentebancarioserver.model.MovCP;
import it.iad2.contocorrentebancarioserver.repository.ClienteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoCorrenteRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoDepositoRepository;
import it.iad2.contocorrentebancarioserver.repository.ContoPrestitoRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCCRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCDRepository;
import it.iad2.contocorrentebancarioserver.repository.MovCPRepository;
import it.iad2.contocorrentebancarioserver.service.SystemAdminService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ContoCorrenteRepository contoCorrenteRepository;
    @Autowired
    ContoDepositoRepository contoDepositoRepository;
    @Autowired
    ContoPrestitoRepository contoPrestitoRepository;
    @Autowired
    MovCCRepository movCCRepository;
    @Autowired
    MovCDRepository movCDRepository;
    @Autowired
    MovCPRepository movCPRepository;

    @Override
    public void generaDatiTest() {
        //Cancellare tutti i dati del DB
        movCCRepository.deleteAllInBatch();
        movCDRepository.deleteAllInBatch();
        movCPRepository.deleteAllInBatch();
        contoCorrenteRepository.deleteAllInBatch();
        contoDepositoRepository.deleteAllInBatch();
        contoPrestitoRepository.deleteAllInBatch();
        clienteRepository.deleteAllInBatch();
        
        //Popola Tabella Cliente
        List<Cliente> clienti = new ArrayList<>();
        clienti.add(new Cliente("Maria", "Rossi", "MR12", "via 1", "4638292", LocalDate.now()));
        clienti.add(new Cliente("Alessio", "Verdi", "AV34", "via 2", "8594837", LocalDate.now()));
        clienti.add(new Cliente("Luisa", "Bianchi", "LB56", "via 3", "4748839", LocalDate.now()));
        clienti.add(new Cliente("Matteo", "Neri", "MN78", "via 4", "4839302", LocalDate.now()));
        clienti.add(new Cliente("Chiara", "Viola", "CV76", "via 5", "73838372", LocalDate.now()));
        clienteRepository.saveAll(clienti);
        
        //Popola Tabella Conto Corrente
        List<ContoCorrente> contiCorrenti = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            contiCorrenti.add(new ContoCorrente("CC" + i));
        }
        
        //Popola Tabella Conto Deposito
        List<ContoDeposito> contiDepositi = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            contiDepositi.add(new ContoDeposito("CD" + i));
        }
        
        //Popola Tabella Conto Prestito
        List<ContoPrestito> contiPrestiti = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            contiPrestiti.add(new ContoPrestito("CP" + i));
        }
        
        //Popola Tabella Movimenti Conto Corrente 
        List<MovCC> movimentiCC = new ArrayList<>();
        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 1000));
        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 200));
        movimentiCC.add(new MovCC(LocalDate.now(), "deposito", 450));
        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 900));
        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 230));
        movimentiCC.add(new MovCC(LocalDate.now(), "rimborso", 125));
        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 400));
        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 720));
        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 50));
        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 2000));
        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 1500));
        movimentiCC.add(new MovCC(LocalDate.now(), "riscatto", 550));
        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 700));
        movCCRepository.saveAll(movimentiCC);
        
        //Popola Tabella Movimenti Conto Deposito
        List<MovCD> movimentiCD = new ArrayList<>();
        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 100));
        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 300));
        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 600));
        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 740));
        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 850));
        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 200));
        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 120));
        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 340));
        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 650));
        movCDRepository.saveAll(movimentiCD);
        
        //Popola Tabella Movimenti Conto Prestito
        List<MovCP> movimentiCP = new ArrayList<>();
        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 1000));
        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 500));
        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 250));
        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 700));
        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 100));
        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 340));
        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 560));
        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 890));
        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 900));
        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 530));
        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 210));
        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 300));
        movCPRepository.saveAll(movimentiCP);
        
        //Associazioni Cliente-ContoCorrente
        clienteRepository.getOne(clienti.get(0).getId()).getListaContiC().add(contiCorrenti.get(5));
        contiCorrenti.get(5).setCliente(clienti.get(0));
        clienteRepository.getOne(clienti.get(1).getId()).getListaContiC().add(contiCorrenti.get(7));
        contiCorrenti.get(7).setCliente(clienti.get(1));
        clienteRepository.getOne(clienti.get(2).getId()).getListaContiC().add(contiCorrenti.get(1));
        contiCorrenti.get(1).setCliente(clienti.get(2));
        clienteRepository.getOne(clienti.get(4).getId()).getListaContiC().add(contiCorrenti.get(6));
        contiCorrenti.get(6).setCliente(clienti.get(4));
        clienteRepository.getOne(clienti.get(0).getId()).getListaContiC().add(contiCorrenti.get(2));
        contiCorrenti.get(2).setCliente(clienti.get(0));
        clienteRepository.getOne(clienti.get(0).getId()).getListaContiC().add(contiCorrenti.get(0));
        contiCorrenti.get(0).setCliente(clienti.get(0));
        clienteRepository.getOne(clienti.get(2).getId()).getListaContiC().add(contiCorrenti.get(3));
        contiCorrenti.get(3).setCliente(clienti.get(2));
        clienteRepository.getOne(clienti.get(4).getId()).getListaContiC().add(contiCorrenti.get(4));
        contiCorrenti.get(4).setCliente(clienti.get(4));
        
        //Associazioni Cliente-ContoDeposito
        clienteRepository.getOne(clienti.get(1).getId()).getListaContiD().add(contiDepositi.get(3));
        contiDepositi.get(3).setCliente(clienti.get(1));
        clienteRepository.getOne(clienti.get(2).getId()).getListaContiD().add(contiDepositi.get(0));
        contiDepositi.get(0).setCliente(clienti.get(2));
        clienteRepository.getOne(clienti.get(3).getId()).getListaContiD().add(contiDepositi.get(1));
        contiDepositi.get(1).setCliente(clienti.get(3));
        clienteRepository.getOne(clienti.get(4).getId()).getListaContiD().add(contiDepositi.get(2));
        contiDepositi.get(2).setCliente(clienti.get(4));
        clienteRepository.getOne(clienti.get(1).getId()).getListaContiD().add(contiDepositi.get(4));
        contiDepositi.get(4).setCliente(clienti.get(1));
        
        //Associazioni Cliente-ContoPrestito
        clienteRepository.getOne(clienti.get(0).getId()).getListaContiP().add(contiPrestiti.get(3));
        contiPrestiti.get(3).setCliente(clienti.get(0));
        clienteRepository.getOne(clienti.get(2).getId()).getListaContiP().add(contiPrestiti.get(0));
        contiPrestiti.get(0).setCliente(clienti.get(2));
        clienteRepository.getOne(clienti.get(3).getId()).getListaContiP().add(contiPrestiti.get(1));
        contiPrestiti.get(1).setCliente(clienti.get(3));
        clienteRepository.getOne(clienti.get(3).getId()).getListaContiP().add(contiPrestiti.get(4));
        contiPrestiti.get(4).setCliente(clienti.get(3));
        clienteRepository.getOne(clienti.get(4).getId()).getListaContiP().add(contiPrestiti.get(2));
        contiPrestiti.get(2).setCliente(clienti.get(4));
        
        // salva tutti i dati nel DB
        contoCorrenteRepository.saveAll(contiCorrenti);
        contoDepositoRepository.saveAll(contiDepositi);
        contoPrestitoRepository.saveAll(contiPrestiti);
        clienteRepository.saveAll(clienti);
    }
}
