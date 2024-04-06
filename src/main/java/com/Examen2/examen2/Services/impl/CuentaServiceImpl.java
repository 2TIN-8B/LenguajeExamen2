package com.Examen2.examen2.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen2.examen2.Services.CuentaService;
import com.Examen2.examen2.entities.Cuentas;
import com.Examen2.examen2.repositorios.CuentasRepositorio;

@Service
public class CuentaServiceImpl implements CuentaService{

    @Autowired
    private CuentasRepositorio cuentasRepositorio;

    public Cuentas crearCuenta(Cuentas cuentas) {
        return this.cuentasRepositorio.save(cuentas);
    }

    @Override
    public List<Cuentas> obtenerCuentas() {
        return (List<Cuentas>) this.cuentasRepositorio.findAll();
    }

}
