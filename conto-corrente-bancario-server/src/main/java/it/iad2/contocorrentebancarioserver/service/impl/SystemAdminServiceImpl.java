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

//        //Popola Tabella Movimenti Conto Corrente 
//        List<MovCC> movimentiCC = new ArrayList<>();
//        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 10000));
//        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 10000));
//        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 10000));
//        movimentiCC.add(new MovCC(LocalDate.now(), "versamento", 10000));
//        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 200));
//        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 200));
//        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 200));
//        movimentiCC.add(new MovCC(LocalDate.now(), "prelievo", 200));
//        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 300));
//        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 300));
//        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 300));
//        movimentiCC.add(new MovCC(LocalDate.now(), "bonificoUscita", 300));
//        movCCRepository.saveAll(movimentiCC);
//
//        //Popola Tabella Movimenti Conto Deposito
//        List<MovCD> movimentiCD = new ArrayList<>();
//        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 10000));
//        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 10000));
//        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 10000));
//        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 10000));
//        movimentiCD.add(new MovCD(LocalDate.now(), "deposito", 10000));
//        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
//        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
//        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
//        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
//        movimentiCD.add(new MovCD(LocalDate.now(), "riscatto", 500));
//        movCDRepository.saveAll(movimentiCD);
//
//        //Popola Tabella Movimenti Conto Prestito
//        List<MovCP> movimentiCP = new ArrayList<>();
//        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 150000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 150000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 150000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "concessione", 150000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 100));
//        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 100));
//        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 100));
//        movimentiCP.add(new MovCP(LocalDate.now(), "rimborso", 100));
//        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 20000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 20000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 20000));
//        movimentiCP.add(new MovCP(LocalDate.now(), "erogazione", 20000));
//        movCPRepository.saveAll(movimentiCP);
//
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

        // salva tutti i dati dei conti correnti nel DB
        contoCorrenteRepository.saveAll(contiCorrenti);
        contoDepositoRepository.saveAll(contiDepositi);
        contoPrestitoRepository.saveAll(contiPrestiti);
        clienteRepository.saveAll(clienti);
        
        // stampe varie
        // lista dei clienti e dei conti associati
        List<Cliente> listaClienti = clienteRepository.findAll();
        listaClienti.forEach(cl ->  {
                                    System.out.println("Cliente : " + cl.getCognome() + " " + cl.getCognome());
                                    List<ContoCorrente> listaContiCorrenti = cl.getListaContiC();
                                    listaContiCorrenti.forEach  (cc ->  {System.out.println("\t Conto Corrente: " + cc.getNumConto().toString());
                                                                        }
                                                                );
                                    List<ContoDeposito> listaContiDepositi = cl.getListaContiD();
                                    listaContiDepositi.forEach  (cd ->  {System.out.println("\t Conto Deposito: " + cd.getCodice().toString());
                                                                        }
                                                                );
                                    List<ContoPrestito> listaContiPrestiti = cl.getListaContiP();                                    
                                    listaContiPrestiti.forEach  (cp ->  {System.out.println("\t Conto Prestito: " + cp.getCodice().toString());
                                                                        }
                                                                );
                                    }
                            );        


        // Crea liste movimenti 
        List<MovCC> movimentiCC = new ArrayList<>();
        List<MovCD> movimentiCD = new ArrayList<>();
        List<MovCP> movimentiCP = new ArrayList<>();

        // Associo CONTO CORRENTE cc1 con indice 0 ai movimenti *ok********************************************************************************
        MovCC movcc0 = new MovCC(LocalDate.now(), "versamento", 10000);
        contoCorrenteRepository.getOne(contiCorrenti.get(0).getId()).getListaMovCC().add(movcc0);
        movimentiCC.add(movcc0);
        movimentiCC.get(0).setContoC(contiCorrenti.get(0));

        MovCC movcc1 = new MovCC(LocalDate.now(), "prelievo", 200);
        contoCorrenteRepository.getOne(contiCorrenti.get(0).getId()).getListaMovCC().add(movcc1);
        movimentiCC.add(movcc1);
        movimentiCC.get(1).setContoC(contiCorrenti.get(0));

        MovCC movcc2 = new MovCC(LocalDate.now(), "prelievo", 100);
        contoCorrenteRepository.getOne(contiCorrenti.get(0).getId()).getListaMovCC().add(movcc2);
        movimentiCC.add(movcc2);
        movimentiCC.get(2).setContoC(contiCorrenti.get(0));

        MovCC movcc3 = new MovCC(LocalDate.now(), "bonificoUscita", 300);
        contoCorrenteRepository.getOne(contiCorrenti.get(0).getId()).getListaMovCC().add(movcc3);
        movimentiCC.add(movcc3);
        movimentiCC.get(3).setContoC(contiCorrenti.get(0));

        // Associo CONTO CORRENTE cc2 con indice 1 ai movimenti *********************************************************************************
        MovCC movcc4 = new MovCC(LocalDate.now(), "versamento", 10000);
        contoCorrenteRepository.getOne(contiCorrenti.get(1).getId()).getListaMovCC().add(movcc4);
        movimentiCC.add(movcc4);
        movimentiCC.get(4).setContoC(contiCorrenti.get(1));

//        MovCD movcd0 = new MovCD(LocalDate.now(), "deposito", 200);
//        contoCorrenteRepository.getOne(contiCorrenti.get(1).getId()).getListaMovCD().add(movcd0);
//        movimentiCD.add(movcd0);
//        movimentiCD.get(0).setContoC(contiCorrenti.get(1));
//        
//        MovCP movcp0 = new MovCP(LocalDate.now(), "concessione", 400000);
//        contoCorrenteRepository.getOne(contiCorrenti.get(1).getId()).getListaMovCP().add(movcp0);
//        movimentiCP.add(movcp0);
//        movimentiCP.get(0).setContoC(contiCorrenti.get(1));
        
        // Associo CONTO CORRENTE cc3 con indice 2 ai movimenti *ok********************************************************************************
        MovCC movcc5 = new MovCC(LocalDate.now(), "versamento", 5000);
        contoCorrenteRepository.getOne(contiCorrenti.get(2).getId()).getListaMovCC().add(movcc5);
        movimentiCC.add(movcc5);
        movimentiCC.get(5).setContoC(contiCorrenti.get(2));

        MovCC movcc6 = new MovCC(LocalDate.now(), "prelievo", 100);
        contoCorrenteRepository.getOne(contiCorrenti.get(2).getId()).getListaMovCC().add(movcc6);
        movimentiCC.add(movcc6);
        movimentiCC.get(6).setContoC(contiCorrenti.get(2));

        MovCC movcc7 = new MovCC(LocalDate.now(), "bonificoUscita", 400);
        contoCorrenteRepository.getOne(contiCorrenti.get(2).getId()).getListaMovCC().add(movcc7);
        movimentiCC.add(movcc7);
        movimentiCC.get(7).setContoC(contiCorrenti.get(2));

        // Associo CONTO CORRENTE 4 con indice 3 ai movimenti *ok********************************************************************************
        //MovCP movcp1 = new MovCP(LocalDate.now(), "concessione", 200000);
        //contoCorrenteRepository.getOne(contiCorrenti.get(3).getId()).getListaMovCP().add(movcp1);
        //movimentiCP.add(movcp1);
        //movimentiCP.get(1).setContoC(contiCorrenti.get(3));
        MovCC movcc8 = new MovCC(LocalDate.now(), "versamento", 1000);
        contoCorrenteRepository.getOne(contiCorrenti.get(3).getId()).getListaMovCC().add(movcc8);
        movimentiCC.add(movcc8);
        movimentiCC.get(8).setContoC(contiCorrenti.get(3));

        MovCC movcc9 = new MovCC(LocalDate.now(), "bonificoUscita", 400);
        contoCorrenteRepository.getOne(contiCorrenti.get(3).getId()).getListaMovCC().add(movcc9);
        movimentiCC.add(movcc9);
        movimentiCC.get(9).setContoC(contiCorrenti.get(3));

        MovCC movcc10 = new MovCC(LocalDate.now(), "bonificoUscita", 400);
        contoCorrenteRepository.getOne(contiCorrenti.get(3).getId()).getListaMovCC().add(movcc10);
        movimentiCC.add(movcc10);
        movimentiCC.get(10).setContoC(contiCorrenti.get(3));

        // Associo CONTO CORRENTE 5 con indice 4 ai movimenti *********************************************************************************
        MovCC movcc11 = new MovCC(LocalDate.now(), "versamento", 10000);
        contoCorrenteRepository.getOne(contiCorrenti.get(4).getId()).getListaMovCC().add(movcc11);
        movimentiCC.add(movcc11);
        movimentiCC.get(11).setContoC(contiCorrenti.get(4));

        MovCC movcc12 = new MovCC(LocalDate.now(), "prelievo", 10000);
        contoCorrenteRepository.getOne(contiCorrenti.get(4).getId()).getListaMovCC().add(movcc12);
        movimentiCC.add(movcc12);
        movimentiCC.get(12).setContoC(contiCorrenti.get(4));

        //MovCD movcd1 = new MovCD(LocalDate.now(), "deposito", 200);
        //contoCorrenteRepository.getOne(contiCorrenti.get(4).getId()).getListaMovCD().add(movcd1);
        //movimentiCD.add(movcd1);
        //movimentiCD.get(1).setContoC(contiCorrenti.get(4));
        //MovCD movcd2 = new MovCD(LocalDate.now(), "riscatto", 50);
        //contoCorrenteRepository.getOne(contiCorrenti.get(4).getId()).getListaMovCD().add(movcd2);
        //movimentiCD.add(movcd2);
        //movimentiCD.get(2).setContoC(contiCorrenti.get(4));
        
        // Associo CONTO CORRENTE 6 con indice 5 ai movimenti *ok********************************************************************************
        MovCC movcc13 = new MovCC(LocalDate.now(), "versamento", 400);
        contoCorrenteRepository.getOne(contiCorrenti.get(5).getId()).getListaMovCC().add(movcc13);
        movimentiCC.add(movcc13);
        movimentiCC.get(13).setContoC(contiCorrenti.get(5));

        //MovCP movcp2 = new MovCP(LocalDate.now(), "erogazione", 2000);
        //contoCorrenteRepository.getOne(contiCorrenti.get(5).getId()).getListaMovCP().add(movcp2);
        //movimentiCP.add(movcp2);
        //movimentiCP.get(13).setContoC(contiCorrenti.get(5));
        
        // Associo CONTO CORRENTE 7 con indice 6 ai movimenti *********************************************************************************
        MovCC movcc14 = new MovCC(LocalDate.now(), "versamento", 3500);
        contoCorrenteRepository.getOne(contiCorrenti.get(6).getId()).getListaMovCC().add(movcc14);
        movimentiCC.add(movcc14);
        movimentiCC.get(14).setContoC(contiCorrenti.get(6));

        // Associo CONTO CORRENTE 8 con indice 7 ai movimenti *ok********************************************************************************
        MovCC movcc15 = new MovCC(LocalDate.now(), "versamento", 1500);
        contoCorrenteRepository.getOne(contiCorrenti.get(7).getId()).getListaMovCC().add(movcc15);
        movimentiCC.add(movcc15);
        movimentiCC.get(15).setContoC(contiCorrenti.get(7));

        MovCC movcc16 = new MovCC(LocalDate.now(), "versamento", 200);
        contoCorrenteRepository.getOne(contiCorrenti.get(7).getId()).getListaMovCC().add(movcc16);
        movimentiCC.add(movcc16);
        movimentiCC.get(16).setContoC(contiCorrenti.get(7));

        //MovCP movcp3 = new MovCP(LocalDate.now(), "erogazione", 4000);
        //contoCorrenteRepository.getOne(contiCorrenti.get(7).getId()).getListaMovCP().add(movcp3);
        //movimentiCP.add(movcp3);
        //movimentiCP.get(3).setContoC(contiCorrenti.get(7));
//
// Associo CONTO DEPOSITO 0 ai movimenti *********************************************************************************
        // to do        
// Associo CONTO DEPOSITO 1 ai movimenti *********************************************************************************
        // to do
// Associo CONTO DEPOSITO 2 ai movimenti *********************************************************************************
        // to do
// Associo CONTO DEPOSITO 3 ai movimenti *********************************************************************************
        // to do
// Associo CONTO DEPOSITO 4 ai movimenti *********************************************************************************
        // to do
//
//
//
// Associo CONTO PRESTITO 0 ai movimenti *********************************************************************************
        // to do
// Associo CONTO PRESTITO 1 ai movimenti *********************************************************************************
        // to do
// Associo CONTO PRESTITO 2 ai movimenti *********************************************************************************
        // to do
// Associo CONTO PRESTITO 3 ai movimenti *********************************************************************************
        // to do        
// Associo CONTO PRESTITO 4 ai movimenti *********************************************************************************
        // to do
//--------------------------------------------------------------------------------
        // salva tutti i dati dei movimenti nel DB
        movCCRepository.saveAll(movimentiCC);
        movCDRepository.saveAll(movimentiCD);
        movCPRepository.saveAll(movimentiCP);
        contoCorrenteRepository.saveAll(contiCorrenti);

        // stampe varie
        // lista dei clienti, dei conti associati e dei movimenti
        List<Cliente> listaClienti1 = clienteRepository.findAll();
        listaClienti1.forEach(cl ->  {
                                    System.out.println("Cliente : " + cl.getNome() + " " + cl.getCognome());
                                    List<ContoCorrente> listaContiCorrenti = cl.getListaContiC();
                                    listaContiCorrenti.forEach  (cc ->  {
                                                                        System.out.println("\t Conto Corrente: " + cc.getNumConto().toString());
                                                                        List<MovCC> listaMovCC = cc.getListaMovCC();
                                                                        listaMovCC.forEach(mcc -> System.out.println("\t\t Movimento Conto Corrente: data - " + mcc.getDataMov().toString() + " | tipo - " + mcc.getTipoMov() + " | importo - " + mcc.getImportoMov()));
                                                                        }
                                                                );
                                    List<ContoDeposito> listaContiDepositi = cl.getListaContiD();
                                    listaContiDepositi.forEach  (cd ->  {          
                                                                        System.out.println("\t Conto Deposito: " + cd.getCodice().toString());
                                                                        List<MovCD> listaMovCD = cd.getListaMovCD();
                                                                        listaMovCD.forEach(mcd -> System.out.println("\t\t Movimento Conto Deposito: data - " + mcd.getDataMov().toString() + " | tipo - " + mcd.getTipoMov() + " | importo - " + mcd.getImportoMov()));
                                                                        }
                                                                );
                                    List<ContoPrestito> listaContiPrestiti = cl.getListaContiP();                                    
                                    listaContiPrestiti.forEach  (cp ->  {
                                                                        System.out.println("\t Conto Prestito: " + cp.getCodice().toString());
                                                                        List<MovCP> listaMovCP = cp.getListaMovCP();
                                                                        listaMovCP.forEach(mcp -> System.out.println("\t\t Movimento Conto Prestito: data - " + mcp.getDataMov().toString() + " | tipo - " + mcp.getTipoMov() + " | importo - " + mcp.getImportoMov()));
                                                                        }
                                                                );
                                    }
                            );
    }
}
            
        
