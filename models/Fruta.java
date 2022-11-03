package models;

public class Fruta extends Product {
    private String unidadDeVenta;
    public Fruta(String nombre, String unidadDeVenta, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return this.unidadDeVenta;
    }
    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }


    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidadDeVenta() ;
    }
}
