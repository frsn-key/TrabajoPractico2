package Ejercicio2.AgenciadeTurismo;

import java.util.ArrayList;
import java.util.Objects;

public class Paquete {
    private String destino;
    private Proveedor Transporte;
    private Proveedor Hospedaje;
    private ArrayList<Proveedor> Excursiones;

    @Override
    public String toString() {
        return "\nPaquete: " +
                "Destino: " + destino + '\n' +
                "Transporte: " + Transporte +'\n' +
                "Hospedaje: " + Hospedaje +'\n' +
                "Excursiones: " + Excursiones +'\n';
    }

    public Paquete(String destino) {
        this.destino = destino;
        this.Transporte = null;
        this.Hospedaje = null;
        this.Excursiones = new ArrayList<Proveedor>();
    }
    public Boolean Agregar_al_Paquete(Proveedor proveedor){
        if(proveedor==null){
            return false;
        }
        if((proveedor.Validar_Destino(this.destino.toLowerCase()))&&(proveedor.getTipo_proveedor()==Tipo_Proveedor.TRASNPORTE)&&this.Transporte==null){
            this.Transporte = proveedor;
            return true;
        }
        if((proveedor.Validar_Destino(this.destino.toLowerCase()))&&(proveedor.getTipo_proveedor()==Tipo_Proveedor.HOSPEDAJE)&&this.Hospedaje==null){
            this.Hospedaje = proveedor;
            return true;
        }
        if((proveedor.Validar_Destino(this.destino.toLowerCase()))&&(proveedor.getTipo_proveedor()==Tipo_Proveedor.EXCURSIONES)){
            for (Proveedor excursion:Excursiones) {
                if(Objects.equals(excursion.getNombre(), proveedor.getNombre())){
                    return true;
                }
            }
            this.Excursiones.add(proveedor);
            return true;
        }
        return false;
    }
    public Boolean Paquete_valido(){
        return (this.Hospedaje!=null)&&(this.Transporte!=null)&&(this.Excursiones.size()!=0);
    }
    public String getdestino() {
        return this.destino;
    }


}
