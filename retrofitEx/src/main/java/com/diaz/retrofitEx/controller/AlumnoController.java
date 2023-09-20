package com.diaz.retrofitEx.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diaz.retrofitEx.entidad.Alumno;
import com.diaz.retrofitEx.service.AlumnoService;

@RestController
@RequestMapping("api/alumnos")
public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;

	@GetMapping("listado")
	public List<Alumno> findAll() {
		return alumnoService.findAll();
	}

	@PostMapping("/agregar")
	public Alumno GuardarAlumno(@RequestBody Alumno alumno) {
		return alumnoService.saveAlumno(alumno);
	}

	@PutMapping("/{id}")
	public Alumno ActualizarAlumno(@RequestBody Alumno alumno, @PathVariable Long id) {
		return alumnoService.updateAlumno(id, alumno);

	}

	@DeleteMapping("/{id}")
	public String eliminarAlumno(@PathVariable Long id) {
		alumnoService.deleteAlumno(id);
		return "Eliminado Correctamente";
	}
}
