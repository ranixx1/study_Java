package exercicios.beecrowd;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double salario = scanner.nextDouble();
        double novo_salario;
        double reajuste;

        if(salario <= 400.00){
            reajuste = salario * 0.15;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15 %");

        } else if(salario > 400.00 && salario <= 800.00){
            reajuste = salario * 0.12;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12 %");

        } else if(salario > 800.00 && salario <= 1200.00){
            reajuste = salario * 0.10;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10 %");

        } else if(salario > 1200.00 && salario <= 2000.00){
            reajuste = salario * 0.07;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7 %");

        } else if(salario > 2000.00){
            reajuste = salario * 0.04;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
        
        scanner.close();
    }
}