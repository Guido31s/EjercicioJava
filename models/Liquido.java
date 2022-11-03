package models;

public class Liquido extends Product {

    private double contenido;

    public Liquido(String nombre, double contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public double getContenido() {
        return this.contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getContenido() + " /// Precio: $" + getPrecio();
    }

}
