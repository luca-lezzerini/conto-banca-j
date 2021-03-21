package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoDepositoRepository extends JpaRepository<ContoDeposito,Long>{
    // List<ContoDeposito>findByIdCliente(Long id);
    
}
