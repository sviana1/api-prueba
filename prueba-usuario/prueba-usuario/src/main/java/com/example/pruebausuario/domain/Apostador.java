package com.example.pruebausuario.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="apostador")
public class Apostador extends Usuario{
    @Column(name = "saldo")
    private float saldo;
}
