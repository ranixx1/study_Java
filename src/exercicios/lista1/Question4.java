//Faça um programa que leia uma temperatura em Celsius e a converta para Fahrenheit.
//Fórmula: F = C * 1.8 + 32
package exercicios.lista1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        float celsius = scanner.nextFloat();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
