package it.iad2.contocorrentebancarioserver.repository;


import it.iad2.contocorrentebancarioserver.model.MovCD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovCDRepository extends JpaRepository<MovCD,Long>{
    
}
