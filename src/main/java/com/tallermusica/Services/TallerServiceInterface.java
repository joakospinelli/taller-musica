package com.tallermusica.Services;

import java.util.List;

import com.tallermusica.DTO.AlumnoDTO;
import com.tallermusica.Model.Alumno;
import com.tallermusica.Model.Instrumento;

public interface TallerServiceInterface {

    public void addAlumno(Alumno a);
    public void addInstrumento(Instrumento i);

    public List<Alumno> getAllAlumnos();
    public List<Instrumento> getAllInstrumentos();

    public Instrumento getInstrumento(String nombre);
    public List<AlumnoDTO> getAlumnosInstrumento(String nombre);

}
