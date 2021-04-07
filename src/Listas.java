import java.util.ArrayList;

public class Listas {

    static ArrayList<Object> clientes = new ArrayList();
    static ArrayList<Object> productos = new ArrayList();
    static ArrayList<Object> pedidos = new ArrayList();


    public static void verProductos() {
        for (int i = 0; i < Listas.productos.size(); i++) {
            System.out.println(Listas.productos.get(i));
        }
    }

    public static void verClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }

    public static void verPedidos() {
        for (int i = 0; i < Listas.pedidos.size(); i++) {
            System.out.println(Listas.pedidos.get(i));
        }

    }

}