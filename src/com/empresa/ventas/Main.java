package com.empresa.ventas;
public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Zapatillas", 50);
        Venta v = new Venta();
        System.out.println("Total: " + v.calcularTotal(p, 2));
        System.out.println("Total con descuento: " + v.calcularTotalConDescuento(p, 2, 0.10));
        System.out.println("Total con impuestos: " +
                v.calcularTotal(p, 2) * 1.21);

    }
}