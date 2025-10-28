package exercicios.beecrowd.vetores;
import java.util.Scanner;
//vive: cano[i+1]-cano[i] <=altura_pulo   
public class PuloSapo {                                     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
        int[] canos = new int[N];
        for (int i = 0; i < N; i++) {
            canos[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            int diferenca = Math.abs(canos[i+1] - canos[i]);
            
            if (diferenca > P) {
                System.out.println("GAME OVER");
                sc.close(); 
                return;
            }
        }
        System.out.println("YOU WIN");
        sc.close();
    }
 
}
