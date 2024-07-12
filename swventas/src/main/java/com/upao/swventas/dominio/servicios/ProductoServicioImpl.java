package com.upao.swventas.dominio.servicios;

import com.upao.swventas.dominio.entidades.Producto;
import com.upao.swventas.infraestructura.repositorios.ProductoRepositorioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    ProductoRepositorioImpl productoRepositorio;

    @Override
    public List<Producto> Listar() {
        return productoRepositorio.listar();
    }

    @Override
    public Producto Guardar(Producto producto) {
       productoRepositorio.save(producto);
       return producto;
    }
}
