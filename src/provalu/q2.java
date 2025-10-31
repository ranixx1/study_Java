package provalu;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma_divisores = 0;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                soma_divisores += i;
            }
        }
        if (n <= 1) {
            System.out.println(n + " não eh perfeito");
        } else if (soma_divisores == n) {
            System.out.println(n + " eh perfeito");
        } else {
            System.out.println(n + " não eh perfeito");
        }

        sc.close();

    }
}
