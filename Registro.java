package Tarea2Clase;

public class Registro
{
    private Cliente cliente;

    private Tienda tienda;

    public Registro()
    {

    }

    public Registro(Cliente cliente, Tienda tienda) {
        this.cliente = cliente;
        this.tienda = tienda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}
