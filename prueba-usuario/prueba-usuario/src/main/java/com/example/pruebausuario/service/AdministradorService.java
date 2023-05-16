package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.domain.Apostador;

import java.util.List;

public interface AdministradorService {
    Administrador createAdministrador(Administrador administrador);

    List<Administrador> listarAdministradores();
    /*void deleteByDni(Long dni); */

    Administrador actualizarAdministrador(Administrador administrador);

    //OTRO INTENTO PARA ELIMINAR
    void eliminarAdministrador(Long dni);

}
