package com.example.parcial2.models.mappers;

import com.example.parcial2.models.Sala;
import com.example.parcial2.models.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapperSala {

    //No se mapean los otro atributos, ya que son nativos del modelo Sala

    @Mapping(source = "cine.id", target = "cineId")
    SalaDTO modeloADto(Sala sala);
    List<SalaDTO> listaADto(List<Sala> salas);

    @Mapping(source = "cine.id", target = "cineId")
    Sala dtoAModelo(SalaDTO dto);
    List<Sala> listaAModelo(List<SalaDTO> dtos);
}
