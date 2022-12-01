package br.com.davisadoraADS.LibraryAPI.controller;

import br.com.davisadoraADS.LibraryAPI.model.Autor;
import br.com.davisadoraADS.LibraryAPI.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping("/{id}")
    public Optional<Autor> findById(@PathVariable("id") long id){
        return service.findById(id);
    }

    @GetMapping
    public List<Autor> findAll(){
        return  service.findAll();
    }

    @PostMapping
    public Autor save(@RequestBody Autor model){
        return service.save(model);
    }

    @PutMapping("/{id}")
    public Autor update(@RequestBody Autor model){
        return service.update(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        Optional<Autor> found = service.findById(id);
        if(found.isPresent()){
            service.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return null;
        }
    }
}
