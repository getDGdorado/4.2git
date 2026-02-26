package com.empresa.ventas;

public class Venta {
    public double calcularTotal(Producto producto, int cantidad) {
        return producto.getPrecio() * cantidad;
    }
    public double calcularTotalConImpuesto(Producto producto, int cantidad, double impuesto) {
        double total = calcularTotal(producto, cantidad);
        return total + (total * impuesto);
    }
    public double calcularTotalConDescuento(Producto producto, int cantidad, double descuento) {
        double total = calcularTotal(producto, cantidad);
        return total - (total * descuento);
    }
}
