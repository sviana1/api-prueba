package com.example.pruebausuario.controller;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.domain.Apostador;
import com.example.pruebausuario.service.ApostadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/apostador")
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

    @PutMapping
    public ResponseEntity<Apostador> updateApostador(@RequestBody Apostador apostador){
        Apostador updatedApos= apostadorService.updateApostador(apostador);
        if(updatedApos != null) {
            return new ResponseEntity<Apostador>(updatedApos, HttpStatus.OK);
        } else {
            return new ResponseEntity<Apostador>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> eliminarApostador(@RequestBody Apostador apostador) {
        apostadorService.deleteByDni(apostador.getDni());
        return ResponseEntity.ok().build();
    }
}
