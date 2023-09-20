package com.diaz.retrofitEx.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diaz.retrofitEx.entidad.Carrera;
import com.diaz.retrofitEx.service.CarreraService;

@RestController
@RequestMapping("api/carrera")
public class CarreraController {

	@Autowired
	CarreraService carreraService;

	@GetMapping("listado")
	public List<Carrera> findAll() {
		return carreraService.findAll();
	}

	@PostMapping("/agregar")
	public Carrera AgregarCarrera(@RequestBody Carrera carrera) {
		return carreraService.saveCarrera(carrera);
	}

	@PutMapping("/{id}")
	public Carrera EditarCarrera(@PathVariable Long id, @RequestBody Carrera carrera) {
		return carreraService.updateCarrera(id, carrera);
	}

	@DeleteMapping("/{id}")
	public String EliminarCarrera(@PathVariable Long id) {
		carreraService.deleteCarrera(id);
		return "Eliminado Correctamente";
	}
}
