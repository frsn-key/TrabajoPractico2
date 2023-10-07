package Ejercicio1.ClubdeFutbol;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;

public class Club {
    static private Integer ID_Socio_Actual = 0;
    private ArrayList<Socio> Socios;
    private ArrayList<Actividad> Actividades;
    public Club() {
        this.Actividades = new ArrayList<Actividad>();
        this.Socios = new ArrayList<Socio>();
    }
    public ArrayList<Socio> Filtrar_Socios(Tipo_Suscripcion Suscripcion){
        ArrayList<Socio> filtro = new ArrayList<Socio>();
        for (Socio socio : this.Socios) {
            if(socio.getCredencial().getSuscripcion().ordinal()==Suscripcion.ordinal()){
                filtro.add(socio);
            }
        }
        return filtro;
    }
    public ArrayList<Socio> Filtrar_Socios(Estado estado){
        ArrayList<Socio> filtro = new ArrayList<Socio>();
        for (Socio socio : this.Socios) {
            if(socio.getCredencial().getEstado().ordinal()==estado.ordinal()){
                filtro.add(socio);
            }
        }
        return filtro;
    }
    private ArrayList<Socio> Filtrar_Socios(LocalDate Fecha, ChronoField field){
        ArrayList<Socio> filtro = new ArrayList<Socio>();
        for (Socio socio : this.Socios) {
            if(socio.getFecha_de_Registro().get(field)==Fecha.get(field)){
                filtro.add(socio);
            }
        }
        return filtro;
    }
    public ArrayList<Socio> Nuevos_Mes(){
        return this.Filtrar_Socios(LocalDate.now(),ChronoField.MONTH_OF_YEAR);
    }
    public ArrayList<Socio> Nuevos_Anio(){
        return this.Filtrar_Socios(LocalDate.now(),ChronoField.YEAR);
    }
    public ArrayList<Socio> Nuevos_Dia(){
        return this.Filtrar_Socios(LocalDate.now(),ChronoField.DAY_OF_MONTH);
    }
    public ArrayList<Actividad> Filtrar_Act(Tipo_Suscripcion suscripcion) {
        ArrayList<Actividad> filtro = new ArrayList<Actividad>();
        for (Actividad actividad : this.Actividades) {
            if(suscripcion == Tipo_Suscripcion.DESTACADA){
                if(actividad.getAcceso()==suscripcion) {
                    filtro.add(actividad);
                }
            }else if (actividad.getAcceso().ordinal() <= suscripcion.ordinal()){
                    filtro.add(actividad);
                }
            }
        return filtro;
    }
    private void Cargar_Socio(Socio socio){
        this.Socios.add(socio);
        ID_Socio_Actual+=1;
    }
    private void Cargar_Actividad(Actividad actividad){
        this.Actividades.add(actividad);
    }
    private Integer Prox_ID(){
        return ID_Socio_Actual++;
    }
    public Boolean Registrar_Socio(Integer ID_Socio, String nombre, String apellido, String email,
                                   String telefono, String direccion,Tipo_Suscripcion Suscripcion){
        Socio socio = new Socio(this.Prox_ID(),LocalDate.now(),nombre,apellido,email,telefono,direccion,Suscripcion);
        this.Cargar_Socio(socio);
        return true;
    }
    public Boolean Registrar_Socio(Socio socio){
        this.Cargar_Socio(socio);
        return true;
    }
    public void Cargar_Actividad(String Descripcion,Tipo_Suscripcion Acceso){
        Actividad actividad = Actividad.crear_Actividad(Descripcion,Acceso);
        this.Cargar_Actividad(actividad);
    }

    public void Renovar_Socio(Socio socio, Tipo_Suscripcion Suscripcion){
        socio.Renovar(Suscripcion);
    }



}
