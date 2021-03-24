package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.ContoCorrente;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoCorrenteRepository extends JpaRepository<ContoCorrente,Long>{
     List<ContoCorrente>findByCliente(Long i);
     Stream<ContoCorrente>findByCliente2(Long i);
     
     ContoCorrente findByNumConto(String numConto);
    
}
