public class Empresa extends Cliente{
    String cuit;
    String iva;
    String pago="tarjeta";
    int descuento=10;

    public Empresa(String nombre, String apellido, String nacimiento, String tel, String dni, String cuit, String iva) {
        super(nombre, apellido, nacimiento, tel, dni);
        this.cuit = cuit;
        this.iva = iva;
        Listas.clientes.add(this);
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }


    public int getDescuento() {
        return descuento;
    }


    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }


    @Override
    public String toString() {
        return "Empresa{"+ super.toString() +
                "cuit='" + cuit + '\'' +
                ", iva='" + iva + '\'' +
                ", pago='" + pago + '\'' +
                ", descuento=" + descuento +
                "} ";
    }
}
