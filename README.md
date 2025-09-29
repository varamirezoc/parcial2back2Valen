## Estructura del Proyecto

- models: Contiene las entidades y DTOs (Sala, SalaDTO).
- repositories: Interfaces para el acceso a datos (ISalaRepository).
- services: Lógica de negocio y operaciones sobre las entidades (SalaService).
- mappers: Conversión entre entidades y DTOs (IMapperSala).

## Notas del Desarrollo
- Se identificaron errores iniciales por la falta de dependencias: Spring Web, Spring Data JPA, MySQL, y Spring Boot DevTools.
- Se agregó la dependencia de Lombok para minimizar código repetitivo, evitando la necesidad de escribir manualmente getters, setters y constructores.
- Se configuró la conexión a la base de datos MySQL.
- Se implementaron las capas faltantes del proyecto siguiendo la arquitectura propuesta: entidades, DTOs, repositorios, servicios y mappers.