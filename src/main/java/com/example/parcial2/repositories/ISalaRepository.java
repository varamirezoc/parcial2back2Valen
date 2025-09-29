package com.example.parcial2.repositories;

import com.example.parcial2.helpers.TipoSala;
import com.example.parcial2.models.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepository extends JpaRepository<Sala, Long> {

    List<Sala> findByTipoSala(TipoSala tipoSala);

}
