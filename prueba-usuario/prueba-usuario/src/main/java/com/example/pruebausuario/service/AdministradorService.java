package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.domain.Apostador;

import java.util.List;

public interface AdministradorService {
    Administrador createAdministrador(Administrador administrador);

    List<Administrador> getAllAdministradores();
    /*void deleteByDni(Long dni); */

    //otro intento
    Administrador updateAdministrador(Administrador administrador);

    //OTRO INTENTO PARA ELIMINAR
    void deleteByDni(Long dni);

}
