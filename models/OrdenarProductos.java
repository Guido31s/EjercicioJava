package models;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarProductos {

    ArrayList<Product> product = new ArrayList<>();

    public OrdenarProductos(ArrayList<Product> productos) {
        this.product = productos;
    }

    public ArrayList<Product> getPrecioProducto() {
        Collections.sort(product);
        return product;
    }
}