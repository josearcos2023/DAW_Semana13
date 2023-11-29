package com.miempresa.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "realizado")
    private boolean realizado;
}
