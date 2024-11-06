package com.devDJ.cinerma.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHorario;
    private Date fechaInicio;
    private Date fechaFin;
    private String hora;
}
