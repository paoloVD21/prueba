package com.upao.swventas.controladores;

import com.upao.swventas.dominio.entidades.Producto;
import com.upao.swventas.dominio.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Se coloca * para que acepte cualquier origen
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/")
public class ProductoControladorImpl implements ProductoControlador{

    @Autowired
    ProductoServicio productoServicio;

    @Override
    public List<Producto> listarProductos() {
        return productoServicio.Listar();
    }

    @Override
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoServicio.Guardar(producto);
    }


}
