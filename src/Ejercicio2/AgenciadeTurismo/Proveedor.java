package Ejercicio2.AgenciadeTurismo;

import java.util.ArrayList;

public class Proveedor {
    private String Nombre;
    private Tipo_Proveedor tipo_proveedor;
    private Tipo_Hospedaje tipo_hospedaje;
    private Tipo_Transporte tipo_Transporte;
    private ArrayList<String> destinos;

    static public Proveedor CrearProveedor(Tipo_Proveedor tipo_proveedor, Tipo_Transporte tipo_Transporte,String Nombre){
        if((tipo_proveedor==null)||(tipo_Transporte==null)){
            return null;
        }
        if((tipo_proveedor!=Tipo_Proveedor.TRASNPORTE)||(tipo_Transporte==Tipo_Transporte.NULL)){
            return null;
        }
        return new Proveedor(tipo_proveedor, tipo_Transporte,Nombre);
    }
    static public Proveedor CrearProveedor(Tipo_Proveedor tipo_proveedor, Tipo_Hospedaje tipo_hospedaje,String Nombre){
        if((tipo_proveedor==null)||(tipo_hospedaje==null)){
            return null;
        }
        if((tipo_proveedor!=Tipo_Proveedor.HOSPEDAJE)||(tipo_hospedaje==Tipo_Hospedaje.NULL)){
            return null;
        }
        return new Proveedor(tipo_proveedor,tipo_hospedaje,Nombre);
    }
    static public Proveedor CrearProveedor(Tipo_Proveedor tipo_proveedor,String Nombre){
        if((tipo_proveedor==null)){
            return null;
        }
        if((tipo_proveedor!=Tipo_Proveedor.EXCURSIONES)){
            return null;
        }
        return new Proveedor(tipo_proveedor,Nombre);
    }
    private Proveedor(Tipo_Proveedor tipo_proveedor,String Nombre) {
        this.tipo_proveedor = tipo_proveedor;
        this.tipo_Transporte = Tipo_Transporte.NULL ;
        this.tipo_hospedaje = Tipo_Hospedaje.NULL;
        this.Nombre= Nombre;
        this.destinos= new ArrayList<String>();
    }
    private Proveedor(Tipo_Proveedor tipo_proveedor, Tipo_Transporte tipo_Transporte,String Nombre) {
        this.tipo_proveedor = tipo_proveedor;
        this.tipo_Transporte = tipo_Transporte;
        this.tipo_hospedaje = Tipo_Hospedaje.NULL;
        this.Nombre= Nombre;
        this.destinos= new ArrayList<String>();
    }
    private Proveedor(Tipo_Proveedor tipo_proveedor, Tipo_Hospedaje tipo_hospedaje,String Nombre) {
        this.tipo_proveedor = tipo_proveedor;
        this.tipo_hospedaje = tipo_hospedaje;
        this.tipo_Transporte = Tipo_Transporte.NULL;
        this.Nombre= Nombre;
        this.destinos= new ArrayList<String>();
    }
    public void Agregar_Destino(String destino){
        if(destino==null){
            return;
        }
        if ((!this.Validar_Destino(destino))){
            this.destinos.add(destino.toLowerCase());
        }
    }
    public Boolean Validar_Destino(String destino){
        if(destino==null){
            return false;
        }
        return this.getDestinos().contains(destino.toLowerCase());
    }
    public String getNombre() {
        return Nombre;
    }
    public Tipo_Proveedor getTipo_proveedor() {
        if(this.tipo_proveedor == Tipo_Proveedor.NULL){
            return null;
        }
        return tipo_proveedor;
    }
    public Tipo_Hospedaje getTipo_hospedaje() {
        if(this.tipo_hospedaje == Tipo_Hospedaje.NULL){
            return null;
        }
        return tipo_hospedaje;
    }
    public Tipo_Transporte getTipo_Transporte() {
        return tipo_Transporte;
    }
    private ArrayList<String> getDestinos() {
        return destinos;
    }

    public String toString(){
        String result = "\nNombre: "+this.Nombre;
        result+="\nTipo Proveedor: "+this.tipo_proveedor;
        if(this.tipo_hospedaje!=Tipo_Hospedaje.NULL) {
            result += "\nTipo Hospedaje: " + this.tipo_hospedaje;
        }
        if(this.tipo_Transporte!=Tipo_Transporte.NULL) {
            result += "\nTipo Hospedaje: " + this.tipo_Transporte;
        }
        result+="\n"+this.destinos.toString()+"\n";
        return result;
    }




}
