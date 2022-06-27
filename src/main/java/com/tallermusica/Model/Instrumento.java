package com.tallermusica.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Instrumento {
    
    private Long id;
    private String nombre, tipo, material;

}
