package Ejercicio10.SueldoEmpleado;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{

    private Double sueldo;
    static Double extra = 1000.0;
    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String CUIT) {
        super(nombre, apellido, telefono, CUIT);
    }

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        super(nombre, apellido, telefono, CUIT, cumpleanos);
    }

    @Override
    public Double calcularSueldo() {
        if (super.esMicumple()){
            return this.sueldo+super.getExtra_Cumpleanos()+extra;
        }
        return this.sueldo;
    }

    private void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
