package poo.prova.q2;

public abstract class Forma {

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Forma[area=" + area() + ", perimetro=" + perimetro() + "]";
    }
}
