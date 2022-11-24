package br.com.davisadoraADS.LibraryAPI.service;

import br.com.davisadoraADS.LibraryAPI.model.Autor;
import br.com.davisadoraADS.LibraryAPI.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> findAll(){
        return repository.findAll();
    }

    public Optional<Autor> findById(long id){
        return repository.findById(id);
    }

}
