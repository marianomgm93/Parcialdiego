import java.util.UUID;

public class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private int stock;
    private String id;

    public Producto(String nombre, String marca, int precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.id= UUID.randomUUID().toString();
        Listas.productos.add(this);
    }
    @Override
    public String toString() {
        return "Producto {" +
                "nombre= " + nombre +
                ", marca= " + marca+
                ", precio= " + precio +
                ", stock= " + stock +
                ", id= " + id +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
