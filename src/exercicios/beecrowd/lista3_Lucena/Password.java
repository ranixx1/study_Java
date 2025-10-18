
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        while (!senha.equals("2002")) {
            System.out.println("Senha Invalida");
            senha = scanner.nextLine();
        }
        System.out.println("Acesso Permitido");

        scanner.close();

    }

}
