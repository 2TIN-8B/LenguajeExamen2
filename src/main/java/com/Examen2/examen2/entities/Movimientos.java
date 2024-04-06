package com.Examen2.examen2.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="movimientos")
@Data
public class Movimientos {

    @Id
    @Column(name="idmovimientos")
    private int idMovimientos;
    
    @Column(name="numerocuenta")
    private String numeroCuenta;

    @Column(name="tipomovimiento")
    private char tipoMovimiento;

    private double monto;

    @Column(name="fechamovimiento")
    private Date fechaMovimiento;


}
