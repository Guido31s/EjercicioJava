package models;

public class Fruta extends Product {
    public Fruta(String nombre, String contenido, int precio) {
        super(nombre, contenido, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getContenido();
    }
}
