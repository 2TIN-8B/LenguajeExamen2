package com.Examen2.examen2.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen2.examen2.entities.Movimientos;
import com.Examen2.examen2.repositorios.MovimientoRepositorio;


@Service
public class MovimientoServiceImpl {

    @Autowired
    private MovimientoRepositorio movimientoRepositorio;

    public Movimientos crearMovimientos(Movimientos movimientos) {
        return this.movimientoRepositorio.save(movimientos);
    }

}
