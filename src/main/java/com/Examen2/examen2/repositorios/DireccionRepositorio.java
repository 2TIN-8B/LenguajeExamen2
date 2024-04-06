package com.Examen2.examen2.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Examen2.examen2.entities.Direccion;

@Repository
public interface DireccionRepositorio extends CrudRepository<Direccion, Integer>{

}

