package com.espacios.espaciosdeportivos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "administrador")
@EqualsAndHashCode(callSuper = true)
public class Administrador extends Persona {

    // Constructor rápido con idPersona
    public Administrador(Long idPersona) {
        super.setIdPersona(idPersona);
    }

    @Column(name = "cargo", nullable = false, length = 50)
    private String cargo;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
}