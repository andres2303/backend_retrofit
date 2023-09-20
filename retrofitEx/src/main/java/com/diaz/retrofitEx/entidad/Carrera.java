package com.diaz.retrofitEx.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "CARRERA")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrera")
	private Long id;

	@Column(name = "nombre")
	private String nombre;
}
