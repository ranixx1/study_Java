package exercicios.beecrowd;

import java.util.Scanner;

public class q_2344 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if(nota == 0){
            System.out.println("E");
        }
        else if(nota >0 && nota <36){
            System.out.println("D");
        }
        else if(nota >35 && nota <60){
            System.out.println("C");
        }
        else if(nota >60 && nota <86){
            System.out.println("B");
        }
        else if(nota >85 && nota <101){
            System.out.println("A");
        }
    }
}
