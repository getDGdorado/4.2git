package com.empresa.ventas;

public class Venta {
    public double calcularTotal(Producto producto, int cantidad) {
        return producto.getPrecio() * cantidad;
    }
}
