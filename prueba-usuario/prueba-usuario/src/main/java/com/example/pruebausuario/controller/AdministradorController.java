package com.example.pruebausuario.controller;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.service.AdministradorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/administrador")
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


    @PutMapping
    public ResponseEntity<Administrador> updateAdministrador(@RequestBody Administrador administrador){
        Administrador updatedAdmin = administradorService.updateAdministrador(administrador);
        if(updatedAdmin != null) {
            return new ResponseEntity<Administrador>(updatedAdmin, HttpStatus.OK);
        } else {
            return new ResponseEntity<Administrador>(HttpStatus.NOT_FOUND);
        }
    }
    //OTRO INTENTO DE ELIMINAR POR BODY
    @DeleteMapping
    public ResponseEntity<Void> eliminarAdministrador(@RequestBody Administrador administrador) {
        administradorService.deleteByDni(administrador.getDni());
        return ResponseEntity.ok().build();
    }


}
