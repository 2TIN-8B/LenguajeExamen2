package com.Examen2.examen2.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cuentas")
@Data
public class Cuentas {

    @Id
    @Column(name="numerocuenta")
    private String numeroCuenta;

    private String dni;

    private double saldo;

    private Date fecha;

    private boolean estado;

    private boolean sobregiro;




}
