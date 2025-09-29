package com.example.parcial2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 100, nullable = false, unique = true)
    private String nombre;

    @Column(name = "nit", length = 20, nullable = false, unique = true)
    private String nit;

    //Relacion uno a uno con DetalleCine
    @OneToOne(mappedBy = "cine")
    @JsonBackReference(value = "relacionDetalleCineCine")
    private DetalleCine detalle;

    //Relacion uno a muchos con Sala
    @OneToMany(mappedBy = "cine")
    @JsonBackReference(value = "relacionCineSala")
    private List<Sala> salas;


}