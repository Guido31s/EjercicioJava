package models;

public class Liquido extends Product {

    public Liquido(String nombre, String contenido, int precio) {
        super(nombre, contenido, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getContenido() + " /// Precio: $" + getPrecio();
    }
}
