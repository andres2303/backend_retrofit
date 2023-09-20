package com.diaz.retrofitEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diaz.retrofitEx.entidad.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
