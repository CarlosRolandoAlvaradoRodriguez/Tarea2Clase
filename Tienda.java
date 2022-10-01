package Tarea2Clase;

public class Tienda
{
    private String nombre;

    private String direccion;

    private Cliente cliente;

    public Tienda()
    {

    }

    public Tienda(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
