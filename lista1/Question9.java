package lista1;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Question9 {
    private static String tokenAtual;
    private static boolean tokenValido = false;
    private static Timer timer;
    public static void main(String[]args){
        gerarNovoToken();
        System.out.println("Novo token gerado:" + tokenAtual);
        timer= new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!tokenValido)
                    gerarNovoToken();
                    System.out.println("\nNovo token gerado:" + tokenAtual);
                    System.out.println("Digite o token:");
                    }
                }, 30000, 300000); //30000 milissegundos = 30 segundos

                try (Scanner scanner = new Scanner(System.in)){
                    while(true) {
                        System.out.print("Digite o token: ");
                        String input = scanner.nextLine();
                        if(input.equals(tokenAtual)){
                            System.out.println("Token Válido");
                            timer.cancel(); //cancela o temporizador
                            break; //sai do loop
                        } else {
                            System.out.println("Token Inválido.");
                            tokenValido= false;
                        };
                    }
                }
                }
                private static void gerarNovoToken()
                {
                    SecureRandom secureRandom = new SecureRandom();
                    int token= secureRandom.nextInt(900000)+ 100000;
                    tokenAtual= String.valueOf(token);
                }
            }
                
