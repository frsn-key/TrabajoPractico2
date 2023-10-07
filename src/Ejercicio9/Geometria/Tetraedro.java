package Ejercicio9.Geometria;

public class Tetraedro implements Figura3D{
    public Double Arista;

    public Tetraedro(Double arista) {
        Arista = arista;
    }

    @Override
    public Double getArea() {
        return Math.pow(Arista,2)*Math.cbrt(3);
    }
    @Override
    public Double getVolumen() {
        return Math.pow(Arista,3)*(Math.sqrt(2)/12);
    }
}
