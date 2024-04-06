package com.Examen2.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen2.examen2.Services.impl.CuentaServiceImpl;
import com.Examen2.examen2.entities.Cuentas;

@RestController
@RequestMapping("/apicue")
public class CuentaController {

    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    @PostMapping("/cuenta/crear")
    public Cuentas crearCuenta(@RequestBody Cuentas cuentas) {
        return this.cuentaServiceImpl.crearCuenta(cuentas);
    }

    @GetMapping("/cuenta/obtener")
    public List<Cuentas> obtenerCuentas() {
        return this.cuentaServiceImpl.obtenerCuentas();
    }

}
