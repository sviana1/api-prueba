package com.example.pruebausuario.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="administradores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Administrador {
    @Id
    @Column(name="dni")
    private Long dni;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="telefono", nullable = false)
    private String telefono;

    @Column(name="correo", nullable = false)
    private String correo;

    @Column(name="direccion", nullable = false)
    private String dirección;

    @Column(name="contrasena", nullable = false)
    private String contrasena;

}
