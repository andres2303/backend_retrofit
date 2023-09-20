package com.diaz.retrofitEx.service;

import java.util.List;
import com.diaz.retrofitEx.entidad.Alumno;

public interface AlumnoService {

	List<Alumno> findAll();

	Alumno saveAlumno(Alumno alumno);

	Alumno updateAlumno(Long id, Alumno alumno);

	void deleteAlumno(Long id);

}
