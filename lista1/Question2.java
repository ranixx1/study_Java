//Fazer um programa que imprima a média aritmética de 10 numeros inteiros e a soma deles.
package lista1;
import java.util.Scanner;
public class Question2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media; //double pq a média pode ser decimal
        for (int i = 0; i < 10; i++){ //i++ incrementa o valor de i em 1 a cada iteração
            System.out.println("Digite um numero inteiro: ");
            int num = scanner.nextInt();
            soma+= num; //+= é o mesmo que soma = soma + num
        }
            media = soma / 10;
            System.out.println("A soma dos numeros é: " + soma);
            System.out.println("A média dos numeros é: " + media);

            scanner.close();
        }
    }

