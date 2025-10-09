import java.lang.Math;
import java.util.Scanner;
public class Maior3 {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int MaiorAB = (a + b + Math.abs(a-b)) / 2;
        if (MaiorAB > c){
            System.out.println(MaiorAB +" eh o maior");
        } else{
            System.out.println(c +" eh o maior");
            
        }

        input.close();
    }
 
}