package com.example.parcial2.repositories;

import com.example.parcial2.models.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICineRepository extends JpaRepository <Cine, Long>{

    List<Cine> findByNombre(String nombre);

    Optional<Cine> findByNit(String nit);
}
