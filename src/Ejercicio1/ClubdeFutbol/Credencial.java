package Ejercicio1.ClubdeFutbol;

import java.time.LocalDate;

public class Credencial {
    private final Integer ID_Socio;
    private LocalDate Fecha_Suscripcion;
    private LocalDate Fecha_Vencimiento;
    private Tipo_Suscripcion Suscripcion;
    private Estado estado;

    static public Credencial crear_Credencial(Integer ID_Socio, Tipo_Suscripcion suscripcion){
        if((ID_Socio==null)||(suscripcion==null)){
            return null;
        }
        return new Credencial(ID_Socio,suscripcion);
    }

    private Credencial(Integer ID_Socio, Tipo_Suscripcion suscripcion) {
        this.ID_Socio = ID_Socio;
        this.setSuscripcion(suscripcion);
        this.setFecha_Suscripcion(LocalDate.now());
        this.setEstado(estado);
    }


    public Integer getID_Socio() {
        return ID_Socio;
    }

    public LocalDate getFecha_Suscripcion() {
        return Fecha_Suscripcion;
    }

    private void setFecha_Suscripcion(LocalDate fecha_Suscripcion) {
        if ((fecha_Suscripcion!=null)&&(!(this.Fecha_Suscripcion.isAfter(fecha_Suscripcion)))){
            Fecha_Suscripcion = fecha_Suscripcion;
            this.Fecha_Vencimiento=this.getFecha_Suscripcion().plusMonths(1);
        }

    }

    public LocalDate getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public Tipo_Suscripcion getSuscripcion() {
        return Suscripcion;
    }

    private void setSuscripcion(Tipo_Suscripcion suscripcion) {
        if(suscripcion==null){
            return;
        }
        Suscripcion = suscripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado) {
        if(estado==null){
            return;
        }
        this.estado = estado;
    }

    public void Renovar(Tipo_Suscripcion Suscripcion){
        if(Suscripcion==null){
            return;
        }
        this.setEstado(Estado.ALTA);
        this.setSuscripcion(Suscripcion);
        this.setFecha_Suscripcion(LocalDate.now());
    }

    public void Actualizar_Estado(){
        if(this.Fecha_Vencimiento.isBefore(LocalDate.now())){
            this.setEstado(Estado.BAJA);
        }
    }

}
