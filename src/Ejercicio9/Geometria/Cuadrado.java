package Ejercicio9.Geometria;

public class Cuadrado implements Figura {
    private Double Lado;

    public Cuadrado(Double lado) {
        Lado = lado;
    }

    @Override
    public Double getArea() {
        return (this.Lado*this.Lado);
    }

    public Double getLado() {
        return Lado;
    }
}
