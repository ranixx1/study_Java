package exercicios.lista1;
//crie com o operado do e while um que peça um numero ao usúario e ele conte do 0, 1,2 ate numeros vezes com for

import java.util.Scanner;
public class Question14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número:");
        int numero = scanner.nextInt();
        for(int i = 0; i<numero; i++) {
            System.out.println((i));
        }
        scanner.close();
    }
    
}
