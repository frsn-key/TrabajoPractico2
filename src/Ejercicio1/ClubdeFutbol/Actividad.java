package Ejercicio1.ClubdeFutbol;

public class Actividad {
    private String Descripcion;
    private Tipo_Suscripcion Acceso;

     static public Actividad crear_Actividad(String Descripcion,Tipo_Suscripcion Acceso){
        if((Descripcion==null)||(Acceso == null)){
            return null;
        }
        return new Actividad(Descripcion,Acceso);
    }
    private Actividad(String descripcion, Tipo_Suscripcion acceso) {
        Descripcion = descripcion;
        Acceso = acceso;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public Tipo_Suscripcion getAcceso() {
        return Acceso;
    }
    public Boolean Acceso_Valido(Tipo_Suscripcion suscripcion){
        if(suscripcion==null){
            return  false;
        }
        return this.getAcceso().ordinal()<=suscripcion.ordinal();
    }



}
