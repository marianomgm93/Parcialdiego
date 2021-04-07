
public class Cliente {
    private int idCliente;
    private static int conCliente;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String tel;
    private String dni;

    public Cliente() {
        this.idCliente=++Cliente.conCliente;
    }
    public Cliente(String nombre, String apellido, String nacimiento, String tel, String dni) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.tel = tel;
        this.dni = dni;

    }




    public int getIdCliente() {
        return idCliente;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", tel='" + tel + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
