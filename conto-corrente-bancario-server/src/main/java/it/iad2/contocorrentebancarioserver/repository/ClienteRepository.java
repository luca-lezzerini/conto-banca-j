package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
