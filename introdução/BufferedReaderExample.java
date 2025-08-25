//Entrada de dados com buffered reader//
          
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader dadEnt = new BufferedReader(new InputStreamReader(System.in));
        String nome = "";
        System.out.println("Digite seu nome:");
        try {
            nome = dadEnt.readLine();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Seja bem-vindo a interatividade " + nome);
    }
}

