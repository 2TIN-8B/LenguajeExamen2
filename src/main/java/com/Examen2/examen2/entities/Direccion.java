package com.Examen2.examen2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="direccion")
@Data
public class Direccion {

    @Id
    @Column(name = "iddireccion")
    private int idDireccion;

    private String dni;

    private String estado;

    private String ciudad;

    private String calle;

}
