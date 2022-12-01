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

    public Autor save(Autor model){
        return repository.save(model);
    }

    public Autor update(Autor model){
        var item = repository.findById(model.getId());
        if(item.isPresent()){
            item.get().setNome(model.getNome());
            item.get().setNacionalidade(model.getNacionalidade());
            item.get().setNascimento(model.getNascimento());
            return repository.save(item.get());
        }else{
            return null;
        }
    }

    public void delete(long id){
        var item = repository.findById(id);
        if(item.isPresent()){
            repository.delete(item.get());
        }
    }
}