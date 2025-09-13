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
@Table(name = "invitado")
@EqualsAndHashCode(callSuper = true)
public class Invitado extends Persona {

    // Constructor solo con idPersona 
    public Invitado(Long idPersona) {
        super.setIdPersona(idPersona);
    }

    @Column(name = "verificado", nullable = false)
    private Boolean verificado;
}