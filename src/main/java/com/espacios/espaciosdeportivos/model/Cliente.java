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
@Table(name = "cliente")
@EqualsAndHashCode(callSuper = true)
public class Cliente extends Persona {

    // Constructor que solo recibe el id, útil para referencias rápidas
    public Cliente(Long idPersona) {
        super.setIdPersona(idPersona);
    }

    @Column(name = "estado_cliente", nullable = false, length = 20)
    private String estadoCliente;
}