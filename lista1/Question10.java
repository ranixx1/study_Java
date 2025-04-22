package lista1;
import java.util.Scanner;
public class Question10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto:");
        String texto = scanner.nextLine();
        int quantidadedeLetras = texto.replaceAll("\\s+", "").length();
        System.out.println("o texto que você digitou tem: "+quantidadedeLetras + " letras.");
        scanner.close();

    }
}
