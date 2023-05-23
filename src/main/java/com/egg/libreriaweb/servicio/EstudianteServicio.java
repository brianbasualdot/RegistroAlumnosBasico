package com.egg.libreriaweb.servicio;

import com.egg.libreriaweb.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarTodos();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorId(Long id);

    Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);
}
