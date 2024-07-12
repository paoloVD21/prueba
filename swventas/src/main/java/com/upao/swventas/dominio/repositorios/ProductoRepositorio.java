package com.upao.swventas.dominio.repositorios;


import com.upao.swventas.dominio.entidades.Producto;

import java.util.List;

public interface ProductoRepositorio {
    List<Producto> listar();
    Producto save(Producto producto);
}
