package com.Examen2.examen2.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {

    @Id
    @Column(name="dni")
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    public List<Cliente> getCuentas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCuentas'");
    }

}
