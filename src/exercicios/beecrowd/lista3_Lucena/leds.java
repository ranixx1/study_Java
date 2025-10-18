import java.util.Scanner;

public class leds {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Lê a quantidade de casos de teste
        int qtd = scanner.nextInt();
 
        // 2. Loop principal (para cada caso de teste)
        for(int i = 0; i < qtd; i++) {
            
            // 6. Zera o total PARA CADA novo número
            int totalLeds = 0;
            
            // 1 & 3. Lê o número como STRING, não como int
            String valor = scanner.next();
            
            // 2, 3 & 4. Loop interno para percorrer a STRING
            // Note que é 'j < valor.length()', e não '<='
            for (int j = 0; j < valor.length(); j++) {
                
                // 3. Pega o caractere (com 'c' minúsculo)
                char digito = valor.charAt(j);
                
                // Switch está correto
                switch (digito) {
                    case '0': totalLeds += 6; break;
                    case '1': totalLeds += 2; break;
                    case '2': totalLeds += 5; break;
                    case '3': totalLeds += 5; break;
                    case '4': totalLeds += 4; break;
                    case '5': totalLeds += 5; break;
                    case '6': totalLeds += 6; break;
                    case '7': totalLeds += 3; break;
                    case '8': totalLeds += 7; break;
                    case '9': totalLeds += 6; break;
                }
            }
            
            // 5. Imprime o total SÓ DEPOIS de somar todos os dígitos
            System.out.println(totalLeds + " leds");
        }
        
        scanner.close();
    }
}