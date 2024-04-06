package com.Examen2.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen2.examen2.Services.impl.MovimientoServiceImpl;
import com.Examen2.examen2.entities.Movimientos;

@RestController
@RequestMapping("/apimov")
public class MovimientoController {

    @Autowired
    private MovimientoServiceImpl movimientoServiceImpl;

    @PostMapping("/movimiento/crear")
    public Movimientos crearMovimientos(@RequestBody Movimientos movimientos) {
        return this.movimientoServiceImpl.crearMovimientos(movimientos);
    }

}
