package br.com.davisadoraADS.LibraryAPI.service;

import br.com.davisadoraADS.LibraryAPI.model.Livro;
import br.com.davisadoraADS.LibraryAPI.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public Optional<Livro> findById(long id){
        return repository.findById(id);
    }

    public List<Livro> findAll(){
        return repository.findAll();
    }

    public Livro save(Livro model){
        return repository.save(model);
    }

    public Livro update(Livro model){
        var item = repository.findById(model.getId());
        if(item.isPresent()){
            item.get().setIsbn(model.getIsbn());
            item.get().setNome(model.getNome());
            item.get().setTema(model.getTema());
            item.get().setData_lancamento(model.getData_lancamento());
            item.get().setTema(model.getTema());
            item.get().setPais(model.getPais());
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
