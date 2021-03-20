package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.ContoDeposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoDepositoRepository extends JpaRepository<ContoDeposito,Long>{
    
}
