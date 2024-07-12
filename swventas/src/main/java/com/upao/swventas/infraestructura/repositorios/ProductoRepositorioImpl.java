package com.upao.swventas.infraestructura.repositorios;


import com.upao.swventas.dominio.entidades.Producto;
import com.upao.swventas.dominio.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//Se implementa el ProductoRepositorio desde la capa de dominio(Interaccion entre capas)
public class ProductoRepositorioImpl implements ProductoRepositorio {

    @Autowired
    ProductoJpaRepositorio db;

    @Override
    public List<Producto> listar() {
        return db.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return db.save(producto);
    }
}
