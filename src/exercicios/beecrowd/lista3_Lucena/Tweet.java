import java.util.Scanner;
public class Tweet {
 
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       String texto = scanner.nextLine();
       int x=140;
       if(texto.length() <=x){
           System.out.println("TWEET");
       }else{
           System.out.println("MUTE");
       }
       
       scanner.close();
    }
 
}