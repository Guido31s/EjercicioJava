package models;

public class Limpieza extends Product {
    private int contenido;
    public Limpieza(String nombre, int contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return this.contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + "ml /// Precio: $" + getPrecio();
    }
}
