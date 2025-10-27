package exercicios.beecrowd.vetores;
import java.util.Scanner;

public class preenchimentoII {
    
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int T = scanner.nextInt();
        int[] N = new int[1000];
        
        for(int i=0; i<1000;i++){
            N[i] = i % T;
            System.out.println("N[" +i+ "] = " +N[i]);
        }
        scanner.close();
        
    }
 
}