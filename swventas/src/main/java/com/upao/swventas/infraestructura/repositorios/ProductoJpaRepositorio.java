package com.upao.swventas.infraestructura.repositorios;

import com.upao.swventas.dominio.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Generar la logica en la BD
public interface ProductoJpaRepositorio extends JpaRepository<Producto, Integer> {
    List<Producto> findByDescripcion(String descripcion);
}
