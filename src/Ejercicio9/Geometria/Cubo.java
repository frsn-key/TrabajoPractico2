package Ejercicio9.Geometria;

public class Cubo extends Cuadrado implements Figura3D{
    public Cubo(Double lado) {
        super(lado);
    }

    @Override
    public Double getArea() {
        return 6*(super.getArea());
    }
    @Override
    public Double getVolumen() {
        return Math.pow(super.getLado(),3);
    }


}
