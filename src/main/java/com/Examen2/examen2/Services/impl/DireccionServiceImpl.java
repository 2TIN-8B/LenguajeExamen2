package com.Examen2.examen2.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen2.examen2.entities.Direccion;
import com.Examen2.examen2.repositorios.DireccionRepositorio;


@Service
public class DireccionServiceImpl {

    @Autowired
    private DireccionRepositorio direccionRepositorio;

    public Direccion crearDireccion(Direccion direccion) {
        return this.direccionRepositorio.save(direccion);
    }

}
