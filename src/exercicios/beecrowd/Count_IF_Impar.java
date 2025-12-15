package exercicios.beecrowd;

import java.util.Scanner;

public class Count_IF_Impar {
 
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int ini = cs.nextInt();
        int fim = cs.nextInt();
        int soma_impares=0;
        if(ini>fim){
            for(int i=fim;fim<ini;i++){
                 if(i%2!=0){
                    soma_impares+=1;
                }
            }
        }
        else{
            for(int i=ini;i<fim;i++){
                if(i%2!=0){
                    soma_impares+=1;
                }
            }
        }
        System.out.println(soma_impares);
        cs.close();
 
    }
 
}
