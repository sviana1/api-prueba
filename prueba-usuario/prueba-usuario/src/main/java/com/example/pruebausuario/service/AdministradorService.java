package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;

import java.util.List;

public interface AdministradorService {
    Administrador createAdministrador(Administrador administrador);

    List<Administrador> getAllAdministradores();
}
