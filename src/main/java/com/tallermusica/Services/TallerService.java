package com.tallermusica.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tallermusica.DTO.AlumnoDTO;
import com.tallermusica.Model.Alumno;
import com.tallermusica.Model.Instrumento;

@Service
public class TallerService implements TallerServiceInterface {
    
    private ArrayList<Instrumento> instrumentos;
    private ArrayList<Alumno> alumnos;

    public TallerService(){
        this.instrumentos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }

    public void addInstrumento(Instrumento i){
        this.instrumentos.add(i);
    }

    public List<Alumno> getAllAlumnos(){
        return this.alumnos;
    }

    public List<Instrumento> getAllInstrumentos(){
        return this.instrumentos;
    }

    public Instrumento getInstrumento(String nombre){

        return this.instrumentos.stream()
                .filter(i -> i.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<AlumnoDTO> getAlumnosInstrumento(String nombre){
        Long instrumento = this.getInstrumento(nombre).getId();

        List<AlumnoDTO> lista = new ArrayList<>();

        this.alumnos.stream()
            .filter(i -> i.getInstrumento().equals(instrumento))
            .forEach(i -> lista.add(new AlumnoDTO(i)));

        return lista;
    }

}
