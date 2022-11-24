package br.com.davisadoraADS.LibraryAPI.controller;

import br.com.davisadoraADS.LibraryAPI.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;
}
