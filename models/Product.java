package models;

public class Product implements Comparable<Product> {
    private String nombre;
    private int precio;


    public Product(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int compareTo(Product o) {
        return (this.getPrecio() < o.getPrecio() ? -1 : (this.getPrecio() == o.getPrecio() ? 0 : 1));
    }

}
