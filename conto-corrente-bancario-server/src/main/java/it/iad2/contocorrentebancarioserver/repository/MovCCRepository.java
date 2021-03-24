package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.MovCC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovCCRepository extends JpaRepository<MovCC,Long>{
    List<MovCC> findByContoC(Long id);
}
