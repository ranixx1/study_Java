package exercicios.lista1;
//crie com o operador do e while um que peça um numero ao usúario e ele conte do 0, 1,2 ate numeros vezes
import java.util.Scanner;
public class Question13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número:");
        int i=0;
        int numero = scanner.nextInt();
        do {
            System.out.println((i));
            i++;
        } while(i<numero);
        scanner.close();
    }
    
}
