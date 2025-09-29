package com.example.parcial2.services;

import com.example.parcial2.models.Sala;
import com.example.parcial2.models.dtos.SalaDTO;
import com.example.parcial2.models.mappers.IMapperSala;
import com.example.parcial2.repositories.ISalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    @Autowired
    private ISalaRepository salaRepository;

    @Autowired
    private IMapperSala salaMapper;

    public SalaDTO guardarSala(SalaDTO datosSala) throws Exception {
        try {
            //Convertir DTO a modelo
            Sala modelo = salaMapper.dtoAModelo(datosSala);
            //Para guardar el modelo en la base de datos
            Sala salaGuardada = salaRepository.save(modelo);
            //Convertir el modelo guardado a DTO y se retorna
            return salaMapper.modeloADto(salaGuardada);
        } catch (Exception error) {
            throw new Exception("Fallo en el procedimiento " + error.getMessage());
        }
    }

}
