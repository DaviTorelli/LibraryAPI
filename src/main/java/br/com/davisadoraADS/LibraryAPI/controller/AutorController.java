package br.com.davisadoraADS.LibraryAPI.controller;

import br.com.davisadoraADS.LibraryAPI.model.Autor;
import br.com.davisadoraADS.LibraryAPI.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping()
    public List<Autor> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Autor findById(@PathVariable("id") long id){
        var autorModel = service.findById(id);
        if(autorModel.isPresent()){
            return autorModel.get();
        } else{
            return null;
        }
    }
}
