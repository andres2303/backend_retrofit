package com.diaz.retrofitEx.dto;

import com.diaz.retrofitEx.entidad.Carrera;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlumnoDto {

	private String nombre;
	private String apellido;
	private String telefono;
	private Carrera carrera;
}
