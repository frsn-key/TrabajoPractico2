package Ejercicio9.Geometria;

public class Paralelepipedo extends Rectangulo implements Figura3D {
    public Double profundidad;

    public Paralelepipedo(Double base, Double altura,Double profundidad) {
        super(base, altura);
        this.profundidad=profundidad;
    }

    @Override
    public Double getArea() {
        return 2*(super.getArea()+(super.getBase() *this.getProfundidad())+(super.getAltura() *this.getProfundidad()));
    }
    @Override
    public Double getVolumen() {
        return super.getArea()*this.getProfundidad();
    }

    public Double getProfundidad() {
        return profundidad;
    }
}
