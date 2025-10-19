import java.util.Scanner;
public class InberbeMAt {

    public static long CalcularFAT(int n){
        if(n ==0){
            return 1;
        }else{
            return n * CalcularFAT(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd_numeros = scanner.nextInt();
        for(int i=0;i<qtd_numeros;i++){
            int qtd_divisores=0;
            int n = scanner.nextInt();
            for(int j = 1;j<=n;j++){
                if(n%j == 0){
                    qtd_divisores +=1;
                }
            }
        if(qtd_divisores == 2){
                System.out.println(n+"!"+" = " + CalcularFAT(n));
            }
        }
        
        scanner.close();

 
    }
 
}