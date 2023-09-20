package com.diaz.retrofitEx.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaz.retrofitEx.entidad.Carrera;
import com.diaz.retrofitEx.repository.CarreraRepository;
import com.diaz.retrofitEx.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {

	@Autowired
	public CarreraRepository carreraRepository;

	@Override
	public List<Carrera> findAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

	@Override
	public Carrera saveCarrera(Carrera carrera) {
		// TODO Auto-generated method stub
		return carreraRepository.save(carrera);
	}

	@Override
	public Carrera updateCarrera(Long id, Carrera carrera) {
		// TODO Auto-generated method stub
		Carrera CARRERA_BD = carreraRepository.findById(id).get();
		if (Objects.nonNull(carrera.getNombre()) && !"".equalsIgnoreCase(carrera.getNombre())) {
			CARRERA_BD.setNombre(carrera.getNombre());
		}
		return carreraRepository.save(CARRERA_BD);
	}

	@Override
	public void deleteCarrera(Long id) {
		// TODO Auto-generated method stub
		carreraRepository.deleteById(id);
	}

}
