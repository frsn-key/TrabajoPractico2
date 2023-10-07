package Ejercicio2.AgenciadeTurismo;

import java.time.LocalDate;

public class Venta {
    static Integer ID_Actual = 0;

    public LocalDate getFecha_Venta() {
        return Fecha_Venta;
    }

    private Integer id_Compra;
    private Cliente cliente;
    private Paquete paquete;
    private LocalDate Fecha_Venta;
    private Float monto;

    static public Venta CrearCompra(Cliente cliente, Paquete paquete, Float monto){
        if ((cliente==null)||(paquete==null)||(monto==null)){
            return null;
        }
        if ((!paquete.Paquete_valido())||(monto<0.00)){
            return null;
        }
        ID_Actual++;
        return new Venta(cliente,paquete,monto);
    }

    private Venta(Cliente cliente, Paquete paquete, Float monto) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.Fecha_Venta = LocalDate.now();
        this.monto = monto;
        this.id_Compra = ID_Actual;
    }

    public String toString(){
        return "\nCompra N : "+this.id_Compra+"\nFecha Compra: "+this.Fecha_Venta.toString()+
                "\nCliente\n: "+this.cliente.toString()+"\nPaquete:\n"+this.paquete.toString();
    }

    public String destino(){
        return this.paquete.getdestino();
    }
}
