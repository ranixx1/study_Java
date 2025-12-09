package poo.lista1;

import java.util.Scanner;

public class Circle {
    private double raio;

    public Circle(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        double pi = 3.1415;
        return pi * raio * raio;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        // Cria um objeto Circle
        Circle c = new Circle(raio);

        // Exibe o resultado
        System.out.println("A área do círculo é: " + c.calcularArea());

        sc.close();
    }
}
