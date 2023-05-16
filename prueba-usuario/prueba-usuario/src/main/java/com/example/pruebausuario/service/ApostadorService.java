package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
import com.example.pruebausuario.domain.Apostador;

import java.util.List;

public interface ApostadorService {
    Apostador createApostador(Apostador apostador);

    List<Apostador> listarApostadores();
    Apostador actualizarApostador(Apostador apostador);

    void eliminarApostador(Long dni);
}
