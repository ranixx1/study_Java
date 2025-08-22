package exercicios.codeforces.list_01;

import java.util.Scanner;
public class Somasimples {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" DIGITE DOIS NÚMEROS INTEIROS ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("A soma é:" + (n1+n2));

        scanner.close();
    }

}
