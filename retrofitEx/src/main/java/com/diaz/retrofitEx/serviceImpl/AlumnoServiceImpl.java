package com.diaz.retrofitEx.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaz.retrofitEx.entidad.Alumno;
import com.diaz.retrofitEx.repository.AlumnoRepository;
import com.diaz.retrofitEx.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	public AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno saveAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(alumno);
	}

	@Override
	public Alumno updateAlumno(Long id, Alumno alumno) {
		// TODO Auto-generated method stub
		Alumno ALUMNO_BD = alumnoRepository.findById(id).get();
		if (Objects.nonNull(alumno.getNombre()) && !"".equalsIgnoreCase(alumno.getNombre())) {
			ALUMNO_BD.setNombre(alumno.getNombre());

		}
		if (Objects.nonNull(alumno.getApellido()) && !"".equalsIgnoreCase(alumno.getApellido())) {
			ALUMNO_BD.setApellido(alumno.getApellido());

		}
		if (Objects.nonNull(alumno.getTelefono()) && !"".equalsIgnoreCase(alumno.getTelefono())) {
			ALUMNO_BD.setTelefono(alumno.getTelefono());
		}
		return alumnoRepository.save(ALUMNO_BD);
	}

	@Override
	public void deleteAlumno(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

}
