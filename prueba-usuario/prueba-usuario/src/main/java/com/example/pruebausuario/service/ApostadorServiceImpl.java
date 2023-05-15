package com.example.pruebausuario.service;

import com.example.pruebausuario.domain.Administrador;
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

    @Override
    public Apostador updateApostador(Apostador apostador) {
        Apostador adminToUpdate = apostadorRepository.findById(apostador.getDni()).orElse(null);
        if(adminToUpdate != null) {
            adminToUpdate.setNombre(apostador.getNombre());
            adminToUpdate.setTelefono(apostador.getTelefono());
            adminToUpdate.setCorreo(apostador.getCorreo());
            adminToUpdate.setDireccion(apostador.getDireccion());
            adminToUpdate.setContrasena(apostador.getContrasena());
            return apostadorRepository.save(adminToUpdate);
        } else {
            return null;
        }


    }

    @Override
    public void deleteByDni(Long dni) {
        apostadorRepository.deleteById(dni);
    }
}
