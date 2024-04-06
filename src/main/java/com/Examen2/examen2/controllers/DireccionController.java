package com.Examen2.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen2.examen2.Services.impl.DireccionServiceImpl;
import com.Examen2.examen2.entities.Direccion;

@RestController
@RequestMapping("/apidi")
public class DireccionController {

    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/direccion/crear")
    public Direccion crearDireccion(@RequestBody Direccion direccion) {
        return this.direccionServiceImpl.crearDireccion(direccion);
    }

}
