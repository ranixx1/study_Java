//Faça um programa que leia 10 valores e imprima a sua soma.
package exercicios.lista_braulio_test;
import java.util.Scanner;
public class q05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for(int i=1;i<=10;i++){
            int n = scanner.nextInt();
            soma+=n;
        }
        System.out.println(soma);
        scanner.close();
    }
    
}
