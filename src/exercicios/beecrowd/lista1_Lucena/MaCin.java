import java.util.Scanner;
public class Consumo {
 
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int distancia_total = scanner.nextInt();
        double gasto = scanner.nextDouble();
        
        double km_l = distancia_total/gasto;
        System.out.printf("%.3f%n",km_l," km/l");
        scanner.close();
    }
 
}