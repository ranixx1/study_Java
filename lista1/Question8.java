package lista1;
import java.util.Random;
public class Question8 {
    public static void main (String[]args){
        Random random =new Random();
        int token= random.nextInt(900000) + 100000; //Gera um numero entre 100000 e 999999
        System.out.println("Token:"+token);
    }
}
