package exercicios.lista1;
//crie um programa que peça um número e dado o número subtraia 1 até zero
import java.util.Scanner;
public class Question12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número:");
        int i=scanner.nextInt();
        while(i>0){
            System.out.println(i);
            i--;
        }
        scanner.close();
    }
}
