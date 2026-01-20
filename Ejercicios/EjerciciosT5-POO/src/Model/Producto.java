package Model;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        System.out.printf("Nombre: %s %nPrecio: %.2f€ %nCantidad: %du%n", nombre, precio, cantidad);
        return super.toString();
    }
}
