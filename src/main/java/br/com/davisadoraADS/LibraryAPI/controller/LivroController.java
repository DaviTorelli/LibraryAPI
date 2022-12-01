package br.com.davisadoraADS.LibraryAPI.controller;

import br.com.davisadoraADS.LibraryAPI.model.Livro;
import br.com.davisadoraADS.LibraryAPI.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping("/{id}")
    public Optional<Livro> findById(@PathVariable("id") long id){
        return service.findById(id);
    }

    @GetMapping
    public List<Livro> findAll(){
        return  service.findAll();
    }

    @PostMapping
    public Livro save(@RequestBody Livro model){
        return service.save(model);
    }

    @PutMapping
    public Livro update(@RequestBody Livro model){
        return service.update(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        Optional<Livro> found = service.findById(id);
        if(found.isPresent()){
            service.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return null;
        }
    }


}
