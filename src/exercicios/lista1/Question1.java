//questão 1
// Faça um programa que leia a data de nascimento de uma pessoa e mostre-a em dias.
package exercicios.lista1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mes = scanner.nextInt();

        System.out.println("Digite o dia de nascimento:");
        int dia = scanner.nextInt();

        // Cria a data de nascimento
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        // Obtém a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcula o período entre a data de nascimento e a atual
        Period idade = Period.between(dataNascimento, dataAtual);

        // Converte para dias aproximados
        int idadeEmDias = idade.getYears() * 365 + idade.getMonths() * 30 + idade.getDays();

        System.out.println("Idade aproximada em dias: " + idadeEmDias + " dias.");

        scanner.close();
    }
}
