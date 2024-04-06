package com.Examen2.examen2.Services;

import java.util.List;

import com.Examen2.examen2.entities.Cuentas;

public interface CuentaService {

    public Cuentas crearCuenta(Cuentas cuentas);

    public List<Cuentas> obtenerCuentas();

    //crear cuenta
    //asociar cuenta a cliente
    //obtener movimiento por cuenta

}
