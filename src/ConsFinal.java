public class ConsFinal extends Cliente {
    private String pago="efectivo";
    private int descuento=15;

    public ConsFinal(String nombre, String apellido, String nacimiento, String tel, String dni) {
        super(nombre, apellido, nacimiento, tel, dni);
        Listas.clientes.add(this);
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ConsFinal{" + super.toString() +
                "pago='" + pago + '\'' +
                ", descuento=" + descuento +
                "} ";
    }
}
