package com.example.pruebausuario.controller;

import com.example.pruebausuario.domain.Apostador;
import com.example.pruebausuario.service.ApostadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/registrar/apostador")
public class ApostadorController {
    private final ApostadorService apostadorService;
    public ApostadorController(ApostadorService apostadorService){
        this.apostadorService = apostadorService;
    }

    @GetMapping
    public ResponseEntity<List<Apostador>> getAllApostadores(){
        return new ResponseEntity<List<Apostador>>(apostadorService.getAllApostadores(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Apostador> addApostador(@RequestBody Apostador apostador){
        return new ResponseEntity<Apostador>(apostadorService.createApostador(apostador),HttpStatus.CREATED);
    }

}
