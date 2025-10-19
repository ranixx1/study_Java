//Faça um programa que leia números inteiros diferentes de zero e calcule a soma dos valores positivos. O laço do programa termina quando o usuário digita um valor zero. Em seguida o programa imprime a soma dos valores positivos digitados.
package exercicios.lista_braulio_test;
import java.util.Scanner;
public class q07 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int soma =0;
        while(true){
            n = scanner.nextInt();
            if(n ==0){
                System.out.println(soma);
                break;
            }else if(n>0){
                soma+=n;
            }
            
        }
        scanner.close();

    }
    
}
