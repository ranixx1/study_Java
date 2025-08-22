package exercicios.lista2;

import java.util.Scanner;

public class Fatorialjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int n = scanner.nextInt();
        
        long fatorial = Fatorial(n);
        
        System.out.println("O fatorial de " + n + " é " + fatorial);
        scanner.close();
    }


    public static long Fatorial(int n){
       if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return n*Fatorial(n-1);
        }
    }
}
