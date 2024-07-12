package com.upao.swventas.dominio.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//Estructura Hexagonal
//Anotación: El dominio es lo mas central a una aplicación(Logica del negocio)
//Lo que mas se debe de tocar es o controller o repositorioJpa

@Entity
@Getter
@Setter
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name = "precio")
    private double precio;


}
