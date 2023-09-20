package com.diaz.retrofitEx.service;

import java.util.List;

import com.diaz.retrofitEx.entidad.Carrera;

public interface CarreraService {

	List<Carrera> findAll();

	Carrera saveCarrera(Carrera carrera);

	Carrera updateCarrera(Long id, Carrera carrera);

	void deleteCarrera(Long id);

}
