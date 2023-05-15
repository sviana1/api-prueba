package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

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
}
