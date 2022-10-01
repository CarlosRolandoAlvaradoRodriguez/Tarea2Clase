package Tarea2Clase;

public class Main
{
    public static void main(String args[])
    {
        Registro registro0 = new Registro();
        registro0.setTienda(new Tienda("Market Lisa","Jr. Abtao 265"));
        System.out.println("TIENDA");
        System.out.println(registro0.getTienda().getNombre());
        System.out.println(registro0.getTienda().getDireccion());


        Registro registro = new Registro();
        registro.setCliente(new Cliente("Jose", "Nuñes Vicente", 98655412));
        System.out.println("Cliente 1: "+registro.getCliente().getNombre()+", "+registro.getCliente().getApellidos()+", "+registro.getCliente().getDni());

        Registro registro1 = new Registro();
        registro1.setCliente(new Cliente("Arvick", "Jara Herrera", 77456324));
        System.out.println("Cliente 2: "+registro1.getCliente().getNombre()+", "+registro1.getCliente().getApellidos()+", "+registro1.getCliente().getDni());

        Registro registro2 = new Registro();
        registro2.setCliente(new Cliente("Carlos", "Alvarado Rodriguez", 86541325));
        System.out.println("Cliente 4: "+registro2.getCliente().getNombre()+", "+registro2.getCliente().getApellidos()+", "+registro2.getCliente().getDni());

        Registro registro3 = new Registro();
        registro3.setCliente(new Cliente("Abel", "Arteaga Sevillano", 987421365));
        System.out.println("Cliente 5: "+registro3.getCliente().getNombre()+", "+registro3.getCliente().getApellidos()+", "+registro3.getCliente().getDni());

    }

}
