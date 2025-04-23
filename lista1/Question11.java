package lista1;
//criar um programa que elabore um orçamento de uma construtora para o calculo do valor total de construçao de uma piscina
// cubagem da piscina *100
import java.util.Scanner;
public class Question11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a quatida de metros da piscina:");
        int metroPiscina = scanner.nextInt();
        int valorFinal = metroPiscina *100;
        System.out.println("orçamento:" +valorFinal);
        scanner.close();
    }
    
}
