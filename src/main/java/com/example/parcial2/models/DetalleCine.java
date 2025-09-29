package com.example.parcial2.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalles_cine")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;

    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;

    @Column(name = "telefono", length = 15, nullable = false)
    private String telefono;

    //Relacion uno a uno con Cine
    @OneToOne
    @JoinColumn(name = "fk_cine", referencedColumnName = "id", nullable = false, unique = true)
    @JsonManagedReference(value = "relacionDetalleCineCine")
    private Cine cine;



}
