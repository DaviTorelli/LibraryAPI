package br.com.davisadoraADS.LibraryAPI.repository;

import br.com.davisadoraADS.LibraryAPI.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findById(long id);

}
