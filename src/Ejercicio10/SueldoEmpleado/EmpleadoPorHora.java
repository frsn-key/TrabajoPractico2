package Ejercicio10.SueldoEmpleado;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado{

    private Double PrecioHora;
    private Double CantHoras_Mensuales;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String CUIT) {
        super(nombre, apellido, telefono, CUIT);
    }
    public EmpleadoPorHora(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        super(nombre, apellido, telefono, CUIT, cumpleanos);
    }
    @Override
    public Double calcularSueldo() {
        Double sueldo = 0.0;
        if(super.esMicumple()){sueldo = this.CantHoras_Mensuales*this.CantHoras_Mensuales+super.getExtra_Cumpleanos();}
        else{sueldo= this.CantHoras_Mensuales*this.CantHoras_Mensuales;}
        if(CantHoras_Mensuales>=40){return sueldo*(1.20);}
        return sueldo;
    }
}
