package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.domain.Apostador;
import com.example.pruebausuario.repository.AdministradorRepository;
import com.example.pruebausuario.repository.ApostadorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class AdministradorServiceImpl implements AdministradorService {
    private final AdministradorRepository administradorRepository;

    public AdministradorServiceImpl(AdministradorRepository administradorRepository){
        this.administradorRepository = administradorRepository;
    }
    @Override
    public Administrador createAdministrador(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    @Override
    public List<Administrador> getAllAdministradores() {
        return administradorRepository.findAll();
    }


    @Override
    public Administrador updateAdministrador(Administrador administrador) {
        Administrador adminToUpdate = administradorRepository.findById(administrador.getDni()).orElse(null);
        if(adminToUpdate != null) {
            adminToUpdate.setNombre(administrador.getNombre());
            adminToUpdate.setTelefono(administrador.getTelefono());
            adminToUpdate.setCorreo(administrador.getCorreo());
            adminToUpdate.setDireccion(administrador.getDireccion());
            adminToUpdate.setContrasena(administrador.getContrasena());
            return administradorRepository.save(adminToUpdate);
        } else {
            return null;
        }
    }
    //OTRO INTENTO DE ELIMINAR POR BODY
    @Override
    public void deleteByDni(Long dni) {
        administradorRepository.deleteById(dni);
    }
}
