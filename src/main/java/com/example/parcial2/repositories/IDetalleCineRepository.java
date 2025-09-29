package com.example.parcial2.repositories;

import com.example.parcial2.models.Cine;
import com.example.parcial2.models.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetalleCineRepository extends JpaRepository<Cine, Long> {

    List<DetalleCine> findByCiudad(String ciudad);
}
