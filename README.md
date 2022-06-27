# taller-musica
Ejercicio para Argentina Programa usando Spring

En una escuela se tiene una lista en papel de alumnos de un taller de música, donde cada uno de ellos puede tocar un solo instrumento en el coro escolar, sin embargo, un mismo instrumento puede ser tocado por varios alumnos.

Objetivo 1:
- La escuela necesita realizar la carga de cada uno de los alumnos e instrumentos, para ello crear un endpoint que permita recibir mediante el método POST nuevos objetos de ambos y los almacene en una lista. Esta lista será consultada por otros endpoint que se describen en el (objetivo 2).

Objetivo 2:
- La escuela solicita la creación de una API que permita realizar las siguientes consultas:

1. Ver todos los instrumentos con los que cuenta el coro: localhost:8080/instrumentos/traer
2. Ver todos los alumnos del taller de música: localhost:8080/alumnos/traer
3. Traer un instrumento en particular: localhost:8080/instrumentos/traer/{nombre}
4. Traer todos los alumnos que toquen un instrumento: localhost:8080/alumnos/traer/{nombre_instrumento} (Para este endpoint tener en cuenta el uso del patrón DTO para generar la respuesta)
