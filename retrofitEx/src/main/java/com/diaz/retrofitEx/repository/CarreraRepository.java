package com.diaz.retrofitEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diaz.retrofitEx.entidad.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
