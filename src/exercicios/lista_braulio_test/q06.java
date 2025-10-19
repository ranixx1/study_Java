//Faça um programa que leia números inteiros e calcule a soma. O laço do programa termina quando o usuário digita um valor negativo. Em seguida o programa imprime a soma dos valores digitados.
package exercicios.lista_braulio_test;
import java.util.Scanner;
public class q06 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int n = scanner.nextInt();
        while(n>=0){
            soma+=n;
            n=scanner.nextInt();
            if(n<0){
                System.out.println(soma);
                break;
            }
        }
        scanner.close();
    }
    
}
