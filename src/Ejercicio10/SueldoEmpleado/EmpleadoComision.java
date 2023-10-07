package Ejercicio10.SueldoEmpleado;

import Ejercicio3.AcademiadeDanza.Comision;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado{

    private Integer cantVentas;
    private Integer montoVentas;
    static private Double Comision = 15.5;

    public Integer getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(Integer cantVentas) {
        this.cantVentas = cantVentas;
    }

    public Integer getMontoVentas() {
        return montoVentas;
    }

    public static Double getComision() {
        return Comision;
    }

    public static void setComision(Double comision) {
        Comision = comision;
    }

    public void IncVentas(){this.cantVentas++;}

    public void setMontoVentas(Integer monto){
        if(monto<=0){return ;}
        this.montoVentas = monto;
    }
    public EmpleadoComision(String nombre, String apellido, String telefono, String CUIT) {
        super(nombre, apellido, telefono, CUIT);
    }

    public EmpleadoComision(String nombre, String apellido, String telefono, String CUIT, LocalDate cumpleanos) {
        super(nombre, apellido, telefono, CUIT, cumpleanos);
    }

    @Override
    public Double calcularSueldo() {
        if (super.esMicumple()){
            return (this.getMontoVentas()*Comision)+super.getExtra_Cumpleanos()+(this.getMontoVentas()*0.5);
        }
        return (this.getMontoVentas()*Comision);
    }
}
