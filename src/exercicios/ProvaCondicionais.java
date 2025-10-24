package exercicios;
import java.util.Scanner;
public interface ProvaCondicionais {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int maior = a;
        int menor =a;
        if(b>a){
            maior =b;
            menor =a;
            if(c>b){
                maior =c;
                menor =a;
            }
        } else{
            maior =a;
            if(b>c){
                menor =c;
            }else{
                menor = b;
            }
        }
        System.out.println(maior);
        System.out.println(menor);
        scanner.close();

    }
}
