package Ejercicio2.AgenciadeTurismo;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Objects;

public class Agencia {

    private ArrayList<Proveedor> Proveedores;
    private ArrayList<Cliente> Clientes;
    private ArrayList<Paquete> Paquetes;
    private ArrayList<Venta> Ventas;
    public ArrayList<Venta> ventas_Realizadas(){
        return this.Ventas;
    }
    public ArrayList<Venta> ventas_Realizadas(LocalDate Fecha, ChronoField field){
        ArrayList<Venta> filtrar = new ArrayList<Venta>();
        for (Venta venta :this.Ventas) {
            if(venta.getFecha_Venta().get(field)==Fecha.get(field)){
                filtrar.add(venta);
            }
        }
        return filtrar;
    }
    public void Realizar_venta(Cliente cliente, Paquete paquete,Float monto){
        Venta venta =  Venta.CrearCompra(cliente,paquete, monto);
        cliente.Agregar_Compra(venta);
        this.Ventas.add(venta);
    }
    public ArrayList<Venta> ventas_Realizadas(String destino){
        ArrayList<Venta> filtrar = new ArrayList<Venta>();
        for (Venta venta :this.Ventas) {
            if(venta.destino().equals(destino)){
                filtrar.add(venta);
            }
        }
        return filtrar;
    }
    private void Oredenar(){
        int n = this.Ventas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Venta venta1 = this.Ventas.get(j);
                Venta venta2 = this.Ventas.get(j + 1);
                if (venta1.destino().compareTo(venta2.destino())>0) {
                    this.Ventas.set(j, venta2);
                    this.Ventas.set(j + 1, venta1);
                }
            }
        }
    }
    private ArrayList<Venta> Oredenadas(){
        if(this.Ventas==null) return null;
        ArrayList<Venta> ordenadas = new ArrayList<Venta>(this.Ventas);
        int n = ordenadas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Venta venta1 = ordenadas.get(j);
                Venta venta2 = ordenadas.get(j + 1);
                if (venta1.destino().compareTo(venta2.destino())>0) {
                    ordenadas.set(j, venta2);
                    ordenadas.set(j + 1, venta1);
                }
            }
        }
        return ordenadas;
    }
    private String Detino(){
        ArrayList<Venta> ordenadas = this.Oredenadas();
        if (ordenadas==null){
            return "";
        }
        int count= 0;
        int ant = 0;
        String Destino = ordenadas.get(0).destino();
        String Destino_Mas = "";
        for (Venta venta:ordenadas) {
            if(!(Destino.equals(venta.destino()))){
                if(count>ant){
                    Destino_Mas = Destino;
                    ant = count;
                }
                Destino= venta.destino();
                count=0;
            }
            count++;
        }
        return Destino_Mas;
    }

    public String Detino_mas_visitado(){
        if (this.Ventas==null){
            return "";
        }
        ArrayList<String> destinos = new ArrayList<String>();
        int count= 0;
        int ant = 0;
        String Destino_Mas = "";
        for (Venta venta:this.Ventas) {
            if(!destinos.contains(venta.destino())){
                for (Venta venta2:this.Ventas) {
                    if((venta.destino().equals(venta2.destino()))){
                        count++;
                    }
                }
            }
            if(count>ant){
                Destino_Mas = venta.destino();
                ant = count;
            }
            destinos.add(venta.destino());
            count= 0;
        }
        return Destino_Mas;
    }

}
