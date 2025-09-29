package com.example.parcial2.models.dtos;

import com.example.parcial2.helpers.TipoSala;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SalaDTO {
        private Long id;
        private String nombre;
        private Integer capacidad;
        private TipoSala tipoSala;
        private Long cineId;
    }

