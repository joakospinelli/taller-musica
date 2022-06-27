package com.tallermusica.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Alumno {
    
    private Long id, curso, instrumento;
    private String nombre, apellido;

}
