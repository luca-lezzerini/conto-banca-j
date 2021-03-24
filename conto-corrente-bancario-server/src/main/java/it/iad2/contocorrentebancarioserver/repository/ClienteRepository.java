package it.iad2.contocorrentebancarioserver.repository;

import it.iad2.contocorrentebancarioserver.model.Cliente;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByCognomeContains(String s);

    List<Cliente> findByCognomeEquals(String s);

    List<Cliente> findByCognomeLike(String s);

    @Query("select c from Cliente c where c.cognome = ´Rossi´")
    Collection<Cliente> trovaTuttiRossi();

    @Query("select c from Cliente c")
    Collection<Cliente> trovaTutti(Sort sort);

    @Query("select c from Cliente c")
    List<Cliente> trovaTuttiPaginati(Pageable p);

    @Query("select c from Cliente c")
    Slice<Cliente> trovaTuttiPaginati2(Pageable p);

    @Query("select c from Cliente c")
    Page<Cliente> trovaTuttiPaginati3(Pageable p);

    @Query("select c from Cliente c where c.nome = :name")
    Set<Cliente> trovaPerNome(@Param("name") String s);

    @Query("select c from Cliente c where c.nome = :nome")
    Set<Cliente> trovaInBaseAlNome(@Param("nome") String n, Sort sort, Pageable p);

    @Query("select c from Cliente c where c.nome = :nome")
    Set<Cliente> trovaInBaseAlNome(@Param("nome") String n, Pageable p);
}
