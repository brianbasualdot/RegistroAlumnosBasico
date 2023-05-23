package com.egg.libreriaweb.repositorio;

import com.egg.libreriaweb.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository <Estudiante, Long>{

}
