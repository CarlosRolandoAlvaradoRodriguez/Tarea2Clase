package Tarea2Clase;

public class Cliente
{
    private String nombre;

    private  String apellidos;

    private  Integer dni;

    public Cliente()
    {

    }

    public Cliente(String nombre, String apellidos, Integer dni)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
