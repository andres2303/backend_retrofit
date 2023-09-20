package com.diaz.retrofitEx.entidad;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ALUMNO")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "TELEFONO")
	private String telefono;

	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "ID_CARRERA")
	private Carrera carrera;

}
