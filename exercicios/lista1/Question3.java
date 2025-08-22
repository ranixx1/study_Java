//3. Informar um saldo e imprimir o saldo com reajuste de 1%.
package exercicios.lista1;
import java.util.Scanner;
public class Question3 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double saldo;
        double reajuste = 0.01; //1% de reajuste
        System.out.println("Digite seu saldo:");
        saldo = scanner.nextDouble();
        double saldoReajustado = saldo + (saldo * reajuste);
        System.out.println("Seu saldo com reajuste de 1% é: " + saldoReajustado);
        scanner.close();
    }
}