package com.example.parcial2.models;

import com.example.parcial2.helpers.TipoSala;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "salas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "capacidad", nullable = false)
    private Integer capacidad;

    @Column(name = "tipoSala", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoSala tipoSala; // 2D, 3D, IMAX...

    // Relacion muchos a uno con Cine
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_cine", referencedColumnName = "id", nullable = false)
    @JsonManagedReference(value = "relacionCineSala")
    private Cine cine;
}
