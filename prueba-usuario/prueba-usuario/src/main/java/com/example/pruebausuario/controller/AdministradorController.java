package com.example.pruebausuario.controller;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.service.AdministradorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/administrador")
public class AdministradorController {
    private final AdministradorService administradorService;
    public AdministradorController(AdministradorService administradorService){
        this.administradorService = administradorService;
    }

    @GetMapping
    public ResponseEntity<List<Administrador>> getAllAdministradores(){
        return new ResponseEntity<List<Administrador>>(administradorService.getAllAdministradores(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Administrador> addAdministrador(@RequestBody Administrador administrador){
        return new ResponseEntity<Administrador>(administradorService.createAdministrador(administrador),HttpStatus.CREATED);
    }
}
