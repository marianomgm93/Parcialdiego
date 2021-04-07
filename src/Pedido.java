import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
    private int num;
    private int conNum = 0;
    private String fecha;
    private Cliente comprador;
    private final ArrayList<Producto> comprados=new ArrayList<Producto>();



    public Pedido(String fecha, Cliente comprador) {

        this.fecha = fecha;
        this.comprador = comprador;
        this.num = ++conNum;

        Listas.pedidos.add(this);
    }


    public void addItem(Producto item, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            comprados.add(item);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getConNum() {
        return conNum;
    }

    public void setConNum(int conNum) {
        this.conNum = conNum;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Object getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Producto> getComprados() {
        return comprados;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "num=" + num +
                ", conNum=" + conNum +
                ", fecha='" + fecha + '\'' +
                ", comprador=" + comprador.getNombre() +
                ", comprados=" + comprados +
                '}';
    }
}
