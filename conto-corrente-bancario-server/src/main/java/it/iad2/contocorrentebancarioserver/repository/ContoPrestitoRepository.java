package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.ContoPrestito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoPrestitoRepository extends JpaRepository<ContoPrestito, Long> {

    ContoPrestito findByCodice(String s);

}
