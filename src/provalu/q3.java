package provalu;
import java.util.Scanner;

// A + (C- BASE + DESLOCAMENTO) %26
public class q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String letras = sc.nextLine();
        int total_deslocado = sc.nextInt();
        
        String texto_cifrado = "";

        int deslocamento = total_deslocado % 26; 

        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);

            if (Character.isLetter(c)) {
                
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                
                char novoChar = (char) (base + (c - base + deslocamento) % 26);
                
                texto_cifrado += novoChar;

            } else {
                texto_cifrado += c;
            }
        }

        System.out.println(texto_cifrado);

        sc.close();
    }
}