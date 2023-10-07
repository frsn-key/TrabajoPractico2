package Ejercicio2.AgenciadeTurismo;

import java.util.ArrayList;

public class Cliente {
    private String DNI;
    private String Nombre;
    private String Apellido;
    private ArrayList<Venta> ventas;

    public Cliente(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellido = apellido;
        this.ventas =new ArrayList<Venta>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public ArrayList<Venta> getCompras() {
        return ventas;
    }

    public void Agregar_Compra(Venta venta){
        if(venta ==null){return;}
        this.ventas.add(venta);
    }
}
