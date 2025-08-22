package com.devsenior;

public class Main {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("Laptop", 50));
        inventario.agregarProducto(new Producto("Smartphone", 100));
        inventario.agregarProducto(new Producto("Tablet", 20));
        inventario.agregarProducto(new Producto("Monitor", 19));
        inventario.agregarProducto(new Producto("Teclado", 150));
        inventario.agregarProducto(new Producto("Raton", 100));
        
        try {
            
        
        inventario.procesarProducto("Laptop",10);
        inventario.procesarProducto("Smartphone",9);
        inventario.procesarProducto("Tablet",10);
        inventario.procesarProducto("Monitor",18);
        inventario.procesarProducto("Teclado",25);
        inventario.procesarProducto("Raton",10);
        inventario.procesarProducto("Cámara",1);// producto no encontrado

         } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println(e.getMessage());
            }
            
        }
}
    
