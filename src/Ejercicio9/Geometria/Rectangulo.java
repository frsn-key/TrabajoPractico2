package Ejercicio9.Geometria;

public class Rectangulo implements Figura{
    private Double Base;
    private Double Altura;

    public Rectangulo(Double base, Double altura) {
        Base = base;
        Altura = altura;
    }

    @Override
    public Double getArea() {
        return this.Base*this.Altura;
    }

    public Double getBase() {
        return Base;
    }

    public Double getAltura() {
        return Altura;
    }
}
