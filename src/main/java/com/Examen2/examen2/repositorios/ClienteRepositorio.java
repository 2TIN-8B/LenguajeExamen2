package com.Examen2.examen2.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Examen2.examen2.entities.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, String>{

}



