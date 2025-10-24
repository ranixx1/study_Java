import java.util.Scanner;
public class ProximoDobro {
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int []x = new int [10];
        int v = scanner.nextInt();
        x[0]=v;
        for( int i=1;i<10;i++){
             x[i] = x[i-1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + x[i]);
        }
    }
 
}