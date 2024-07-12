package com.upao.swventas.controladores;

import com.upao.swventas.dominio.entidades.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;



public interface ProductoControlador {

    //Voy a devolver un json
    @RequestMapping(value = "/listar", produces = {"application/json"}, method = RequestMethod.GET)
    List<Producto> listarProductos();

    @RequestMapping(value = "/agregar", produces = {"application/json"}, method = RequestMethod.POST)
    Producto agregarProducto(Producto producto);

}
