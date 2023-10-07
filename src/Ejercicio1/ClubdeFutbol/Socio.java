package Ejercicio1.ClubdeFutbol;

import java.time.LocalDate;
import java.util.Objects;

public class Socio {
    private Integer ID_Socio;
    private LocalDate Fecha_de_Registro;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    private String Direccion;
    private Credencial credencial;

    public Socio(Integer ID_Socio, LocalDate fecha_de_Registro,
                 String nombre, String apellido, String email,
                 String telefono, String direccion,Tipo_Suscripcion Suscripcion) {
        this.ID_Socio = ID_Socio;
        this.Fecha_de_Registro = fecha_de_Registro;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Email = email;
        this.Telefono = telefono;
        this.Direccion = direccion;
        this.credencial = Credencial.crear_Credencial(ID_Socio,Suscripcion);
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getID_Socio() {
        return ID_Socio;
    }

    public LocalDate getFecha_de_Registro() {
        return Fecha_de_Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void Actulaizar_Estado(){
        this.credencial.Actualizar_Estado();
    }

    public void Renovar(Tipo_Suscripcion Suscripcion){
        this.credencial.Renovar(Suscripcion);
    }



}
