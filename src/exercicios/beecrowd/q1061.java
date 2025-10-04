package exercicios.beecrowd;

import java.util.Scanner;


public class q1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.next(); // Lê e descarta a String "Dia"
        int dia_inicio = scanner.nextInt();
        
        int hora_inicio = scanner.nextInt();
        scanner.next(); // Lê e descarta os ":"
        int minuto_inicio = scanner.nextInt();
        scanner.next(); // Lê e descarta os ":"
        int segundo_inicio = scanner.nextInt();

        scanner.next(); // Lê e descarta a String "Dia"
        int dia_fim = scanner.nextInt();

        int hora_fim = scanner.nextInt();
        scanner.next(); // Lê e descarta os ":"
        int minuto_fim = scanner.nextInt();
        scanner.next(); // Lê e descarta os ":"
        int segundo_fim = scanner.nextInt();
        
        scanner.close();

        // --- 3. CÁLCULO DA DURAÇÃO ---

        // Converte o tempo de início e fim para um valor total em segundos
        long totalSegundosInicio = (dia_inicio * 86400) + (hora_inicio * 3600) + (minuto_inicio * 60) + segundo_inicio;
        long totalSegundosFim = (dia_fim * 86400) + (hora_fim * 3600) + (minuto_fim * 60) + segundo_fim;

        // Calcula a diferença total em segundos
        long duracaoTotalEmSegundos = totalSegundosFim - totalSegundosInicio;

        // --- 4. CONVERSÃO DO RESULTADO E IMPRESSÃO ---

        // Converte a duração total em segundos de volta para o formato dia, hora, minuto, segundo
        long dias = duracaoTotalEmSegundos / 86400;
        long resto = duracaoTotalEmSegundos % 86400; // Pega o que sobrou da divisão por dias

        long horas = resto / 3600;
        resto = resto % 3600; // Pega o que sobrou da divisão por horas

        long minutos = resto / 60;
        long segundos = resto % 60; // O que sobrou é o valor dos segundos

        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
    }
}