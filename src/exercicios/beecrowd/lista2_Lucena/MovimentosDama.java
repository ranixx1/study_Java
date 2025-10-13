import java.util.Scanner;
import java.lang.Math;

public class MovimentosDama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            // Condição de parada do programa
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break; 
            }

            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            
            } else if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println(1);

            } else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}