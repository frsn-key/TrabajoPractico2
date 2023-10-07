package Ejercicio10.SueldoEmpleado;

import java.time.LocalDate;

public class EmpleadoComisionBase extends EmpleadoComision{
    private Double sueldo;
    static Double extra = 1000.0;
    public EmpleadoComisionBase(String nombre, String apellido, String telefono, String CUIT) {
        super(nombre, apellido, telefono, CUIT);
    }

    public EmpleadoComisionBase(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        super(nombre, apellido, telefono, CUIT, cumpleanos);
    }

    public Double calcularSueldo() {
        if (super.esMicumple()){
            return super.calcularSueldo()+this.sueldo+extra;
        }else{
            return super.calcularSueldo()+this.sueldo;
        }
    }

}
