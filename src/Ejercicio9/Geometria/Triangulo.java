package Ejercicio9.Geometria;

public class Triangulo implements Figura{
    private Double Base;
    private Double Altura;

    public Triangulo(Double base, Double altura) {
        Base = base;
        Altura = altura;
    }

    @Override
    public Double getArea() {
        return (this.Base*this.Altura)/2;
    }

    public Double getBase() {
        return Base;
    }

    public Double getAltura() {
        return Altura;
    }
}
