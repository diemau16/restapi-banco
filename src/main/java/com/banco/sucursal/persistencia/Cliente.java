package com.banco.sucursal.persistencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Cliente {
    @Id
    @Column
    private int idCliente;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private int edad;
}