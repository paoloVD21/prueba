package com.upao.swventas.dominio.servicios;

import com.upao.swventas.dominio.entidades.Producto;

import java.util.List;

public interface ProductoServicio {
    List<Producto> Listar();
    Producto Guardar(Producto producto);
}
