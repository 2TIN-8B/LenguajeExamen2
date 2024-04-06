package com.Examen2.examen2.Services;

import java.util.List;

import com.Examen2.examen2.entities.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerPorDni(String dni);

    // public Cliente asociarCuentaCliente(String numeroCuenta);

    //Crear Cliente
    //Asociar cuenta a cliente
    //obtener clientes
    //obtener clientes por dni
}