package exercicios.listabuferred;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NomeporExtenso {
    public static void main(String[] args) {
        BufferedReader dadEnt = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        System.out.print("digite um numero: ");
        try {
            String linha = dadEnt.readLine();
            numero = Integer.parseInt(linha);
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Entrada inválida!");
            return;
        }

        if (numero == 1) {
            System.out.print("um");
        } else if (numero == 2) {
            System.out.print("dois");
        } else if (numero == 3) {
            System.out.print("três");
        } else if (numero == 4) {
            System.out.print("quatro");
        } else if (numero == 5) {
            System.out.print("cinco");
        } else if (numero == 6) {
            System.out.print("seis");
        } else if (numero == 7) {
            System.out.print("sete");
        } else if (numero == 8) {
            System.out.print("oito");
        } else if (numero == 9) {
            System.out.print("nove");
        } else if (numero == 10) {
            System.out.print("dez");
        } else {
            System.out.println("valor invalido");
        }
    }
}