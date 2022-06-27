package com.tallermusica.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tallermusica.DTO.AlumnoDTO;
import com.tallermusica.Model.Alumno;
import com.tallermusica.Model.Instrumento;
import com.tallermusica.Services.TallerServiceInterface;

@RestController
public class TallerController {
    
    @Autowired
    private TallerServiceInterface service;

    @PostMapping ("/alumno")
    public void addAlumno(@RequestBody Alumno a){
        this.service.addAlumno(a);
    }

    @PostMapping ("/instrumento")
    public void addInstrumento(@RequestBody Instrumento i){
        this.service.addInstrumento(i);
    }

    @GetMapping ("/alumnos/traer")
    public List<Alumno> getAllAlumnos(){
        return this.service.getAllAlumnos();
    }

    @GetMapping ("/instrumentos/traer")
    @ResponseBody
    public List<Instrumento> getAllInstrumentos(){
        return this.service.getAllInstrumentos();
    }

    @GetMapping ("/instrumentos/traer/{nombre}")
    public Instrumento getInstrumento(@PathVariable String nombre){
        return this.service.getInstrumento(nombre);
    }

    @GetMapping ("/alumnos/traer/{nombre}")
    public List<AlumnoDTO> getAlumnosInstrumento(@PathVariable String nombre){
        return this.service.getAlumnosInstrumento(nombre);
    }
}
