package Ejercicio10.SueldoEmpleado;

import java.time.LocalDate;

public class Pasante extends Empleado{
    public Pasante(String nombre, String apellido, String telefono, String CUIT) {
        super(nombre, apellido, telefono, CUIT);
    }

    public Pasante(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        super(nombre, apellido, telefono, CUIT, cumpleanos);
    }

    @Override
    public Double calcularSueldo() {
        return 0.0;
    }
}
