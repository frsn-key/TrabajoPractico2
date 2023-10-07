package Ejercicio9.Geometria;

public class Esfera extends Circulo implements Figura3D{
    public Esfera(Double radio) {
        super(radio);
    }

    @Override
    public Double getArea(){
        return super.getArea()*4;
    }
    public Double getVolumen() {
        return (4/3)*(super.getArea()*super.getRadio());
    }
}
