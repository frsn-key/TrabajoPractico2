package Ejercicio10.SueldoEmpleado;

import java.time.LocalDate;

public abstract class Empleado {

    static private Double extra_Cumpleanos = 2000.0;
    private String Nombre;
    private String Apellido;
    private String telefono;
    private String CUIT;
    private LocalDate cumpleanos;

    public Double getExtra_Cumpleanos(){
        return extra_Cumpleanos;
    }
    public Empleado(String nombre, String apellido, String telefono, String CUIT) {
        this(nombre,apellido,telefono,CUIT,null);
    }

    public Empleado(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        Nombre = nombre;
        Apellido = apellido;
        this.telefono = telefono;
        this.CUIT = CUIT;
        this.cumpleanos = cumpleanos;
    }

    public abstract Double calcularSueldo();
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCUIT() {
        return CUIT;
    }
    public LocalDate getCumpleanos() {
        return cumpleanos;
    }

    public Boolean esMicumple(){
        return LocalDate.now().getMonth().equals(this.getCumpleanos().getMonth());
    }

}
