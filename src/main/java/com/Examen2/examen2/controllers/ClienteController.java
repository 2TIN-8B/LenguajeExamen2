package com.Examen2.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen2.examen2.Services.impl.ClienteServiceImpl;
import com.Examen2.examen2.entities.Cliente;

@RestController
@RequestMapping("/apicli")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/cliente/obtener")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    // @GetMapping("/cliente/obtener/{dni}")

    // }

}
