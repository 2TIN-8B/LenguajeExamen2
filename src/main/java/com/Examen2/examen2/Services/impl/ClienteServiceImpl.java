package com.Examen2.examen2.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen2.examen2.Services.ClienteService;
import com.Examen2.examen2.entities.Cliente;
import com.Examen2.examen2.repositorios.ClienteRepositorio;
//import com.Examen2.examen2.repositorios.CuentasRepositorio;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    // @Autowired
    // private CuentasRepositorio cuentasRepositorio;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepositorio.findAll();
    }

    @Override
    public Cliente obtenerPorDni(String dni) {
        Cliente cliente = this.clienteRepositorio.findById(dni).orElse(null);
        return cliente;
    }

    // @Override
    // public Cliente asociarCuentaCliente(String cuentas, String numeroCuenta) {
    //     if(this.clienteRepositorio.existsById(cuentas)){
    //         if(this.cuentasRepositorio.existsById(numeroCuenta)){
    //             Cliente cliente = this.clienteRepositorio.findById(cuentas).get();
    //             cliente.getCuentas().add(this.cuentasRepositorio.findById(numeroCuenta).get());
    //             this.clienteRepositorio.save(cliente);
    //             return cliente;
    //         }
    //     }
    //     return null;
    // }

}


