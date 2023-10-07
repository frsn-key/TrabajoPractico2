package Ejercicio9.Geometria;

public class Circulo implements  Figura{
    static private final Double PI = Math.PI;
    private Double Radio;

    public Circulo(Double radio) {
        Radio = radio;
    }

    @Override
    public Double getArea() {
        return PI * Math.pow(Radio,2);
    }
    public Double getRadio() {
        return Radio;
    }
}
