import models.Fruta;
import models.Liquido;
import models.Product;
import models.OrdenarProductos;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> items = new ArrayList<Product>();

    public static void main(String[] args) {
        Liquido cocaZero = new Liquido("Coca-Cola Zero", "Litros: 1.5", 20);
        Liquido coca = new Liquido("Coca-Cola", "Litros: 1.5", 18);
        Liquido sedal = new Liquido("Shampoo Sedal", "Contenido: 500ml", 19);
        Fruta frutilla = new Fruta("Frutilla", "Unidad de venta: kilo", 64);

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