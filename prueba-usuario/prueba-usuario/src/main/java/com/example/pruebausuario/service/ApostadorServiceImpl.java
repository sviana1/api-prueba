package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Apostador;
import com.example.pruebausuario.repository.ApostadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApostadorServiceImpl implements ApostadorService{
    private final ApostadorRepository apostadorRepository;

    public ApostadorServiceImpl(ApostadorRepository apostadorRepository){
        this.apostadorRepository = apostadorRepository;
    }
    @Override
    public Apostador createApostador(Apostador apostador) {
        return apostadorRepository.save(apostador);
    }

    @Override
    public List<Apostador> getAllApostadores() {
        return apostadorRepository.findAll();
    }

}
