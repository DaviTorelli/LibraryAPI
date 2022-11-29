package br.com.davisadoraADS.LibraryAPI.repository;

import br.com.davisadoraADS.LibraryAPI.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findById(long id);

    public Page<Livro> findAll(Pageable page);

    List<Livro> findByNomeContainsIgnoreCaseOrderByNome(String nome);

}
