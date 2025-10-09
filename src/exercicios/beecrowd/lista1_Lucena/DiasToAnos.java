
import java.util.Scanner;

public class DiasToAnos{
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qtd_total = scanner.nextInt();
        int qtd_anos = qtd_total / 365;
        int resto = qtd_total % 365;

        int qtd_meses = resto / 30;
        int qtd_dias = resto % 30;

        System.out.printf("%d ano(s)%n", qtd_anos);
        System.out.printf("%d mes(es)%n", qtd_meses);
        System.out.printf("%d dia(s)%n", qtd_dias);
        
        scanner.close();
    }
 
}