package com.empresa.ventas;
public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Zapatillas", 50);
        Venta v = new Venta();
        System.out.println("Total: " + v.calcularTotal(p, 2));
    }
}