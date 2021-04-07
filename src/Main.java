import java.util.ArrayList;
/*
*   AGREGAR PRODUCTOS NUEVOS CREANDO OBJ "Producto"
*   CREAR CLIENTE USANDO OBJ "Empresa o ConsFinal" SEGUN CORRESPONDA
*   VER LISTAS USANDO "Listas.ver*" *= NOMBRE DE CLASE
*   CREAR NUEVO PEDIDO USANDO OBJ "Pedido"
*   AGREGAR PRODUCTOS AL CARRITO USANDO METODO "addItem"
*/
public class Main {

    public static void main(String[] args) {
	// write your code here

        Producto ladrillo= new Producto("Ladrillo","Bugna",30,200);
        Producto chapa= new Producto("chapa", "faule", 2000,100);

        Empresa juan=new Empresa("Juan", "Montenegro", "22/5/93","12356789","377446465","3552022551","Responsable");
        ConsFinal carlos=new ConsFinal("Carlos", "Maul", "30/6/75", "465465465","165654465");
        Listas.verClientes();
        Listas.verProductos();

        Pedido uno= new Pedido("hoy",juan);
        uno.addItem(ladrillo,10);
        Pedido dos= new Pedido("ayer",carlos);
        dos.addItem(ladrillo,3);
        dos.addItem(chapa,2);
        Listas.verPedidos();
    }
}
