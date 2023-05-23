package com.egg.libreriaweb.servicio;

import com.egg.libreriaweb.entidad.Estudiante;
import com.egg.libreriaweb.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{
    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {return repositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
    repositorio.deleteById(id);
    }
}
