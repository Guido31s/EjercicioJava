import models.Fruta;
import models.Limpieza;
import models.Liquido;
import models.Product;
import models.OrdenarProductos;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> items = new ArrayList<Product>();

    public static void main(String[] args) {
        Liquido cocaZero = new Liquido("Coca-Zero", 1.5, 20);
        Liquido coca = new Liquido("Coca-Cola", 1.5, 18);
        Limpieza sedal = new Limpieza("Shampoo Sedal", 500, 19);
        Fruta frutilla = new Fruta("Frutilla", "kilo", 64);
        items.add(cocaZero);
        items.add(coca);
        items.add(sedal);
        items.add(frutilla);

        for (Product item : items) {
            System.out.println(item.toString());
        }

        OrdenarProductos orderProduct = new OrdenarProductos(items);
        ArrayList<Product> productOrder = orderProduct.getPrecioProducto();

        System.out.println("========================\n"
                + "Producto más caro: "
                + productOrder.get(productOrder.size() - 1).getNombre() + "\n"
                + "Producto más barato: " + productOrder.get(0).getNombre());
    }
}