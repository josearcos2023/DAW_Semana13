package com.miempresa.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "rol")
    private String rol;
    @OneToMany
    private List<Tarea> tarea;

}
