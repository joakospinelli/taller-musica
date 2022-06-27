package com.tallermusica.DTO;

import java.io.Serializable;

import com.tallermusica.Model.Alumno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AlumnoDTO implements Serializable {
    
    private Long id;
    private String nombre, apellido;

    public AlumnoDTO(Alumno a){
        this.id = a.getId(); this.nombre = a.getNombre(); this.apellido = a.getApellido();
    }

}
