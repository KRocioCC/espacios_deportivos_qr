package com.espacios.espaciosdeportivos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "usuario_control")
@EqualsAndHashCode(callSuper = true)
public class UsuarioControl extends Persona {

    // Constructor rápido con idPersona
    public UsuarioControl(Long idPersona) {
        super.setIdPersona(idPersona);
    }

    @Column(name = "estado_operativo", nullable = false, length = 20)
    private String estadoOperativo;

    @Column(name = "hora_inicio_turno", nullable = false)
    private LocalTime horaInicioTurno;

    @Column(name = "hora_fin_turno", nullable = false)
    private LocalTime horaFinTurno;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
}
