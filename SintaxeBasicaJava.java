/**
 * SINTAXE BÁSICA JAVA - GUIA DE REFERÊNCIA
 * 
 * Este documento contém os principais conceitos de sintaxe Java.
 */

 import java.util.ArrayList;

 public class SintaxeBasicaJava {
 
     public static void main(String[] args) {
 
         // ========== 1. VARIÁVEIS E TIPOS DE DADOS ==========
 
         // Tipos primitivos inteiros
         byte meuByte = 100;              // 8 bits (-128 a 127)
         short meuShort = 10000;          // 16 bits
         int meuInt = 100000;             // 32 bits (uso mais comum)
         long meuLong = 10000000000L;     // 64 bits (sufixo L)
 
         // Tipos de ponto flutuante
         float meuFloat = 10.5f;          // 32 bits (sufixo f)
         double meuDouble = 20.5;         // 64 bits (precisão dupla)
 
         // Outros tipos
         char meuChar = 'A';              // 16 bits (caractere único)
         boolean ativo = true;            // true/false
 
         // Tipos não primitivos
         String nome = "João";            // Classe para texto
         String[] nomes = new String[5];  // Array de Strings
 
         // ========== 2. OPERADORES ==========
 
         int a = 10, b = 5;
         int soma = a + b;                // 15
         int resto = a % b;               // 0
         boolean comparacao = a > b;      // true
 
         // ========== 3. ESTRUTURAS DE CONTROLE ==========
 
         // If-else
         if (a > b) {
             System.out.println("a é maior");
         } else if (a == b) {
             System.out.println("são iguais");
         } else {
             System.out.println("b é maior");
         }
 
         // Switch-case
         int diaSemana = 3;
         switch (diaSemana) {
             case 1:
                 System.out.println("Segunda");
                 break;
             case 2:
                 System.out.println("Terça");
                 break;
             default:
                 System.out.println("Dia inválido");
         }
 
         // ========== 4. LOOPS ==========
 
         // For tradicional
         for (int i = 0; i < 5; i++) {
             System.out.println("Iteração: " + i);
         }
 
         // For-each
         int[] numeros = {1, 2, 3};
         for (int numero : numeros) {
             System.out.println(numero);
         }
 
         // While
         int contador = 0;
         while (contador < 3) {
             System.out.println("Contagem: " + contador);
             contador++;
         }
 
         // ========== 5. ARRAYS E COLEÇÕES ==========
 
         // Array estático
         int[] valores = new int[3];
         valores[0] = 10;
 
         // ArrayList (dinâmico)
         ArrayList<String> listaNomes = new ArrayList<>();
         listaNomes.add("Maria");
         listaNomes.remove(0);
 
         // ========== 6. CASTING E CONVERSÕES ==========
 
         // Conversão implícita (widening)
         int numInt = 100;
         double numDouble2 = numInt;      // 100.0
 
         // Conversão explícita (narrowing)
         double valor = 25.8;
         int inteiro = (int) valor;       // 25 (truncamento)
 
         // String para número
         String textoNumero = "123";
         int numeroConvertido = Integer.parseInt(textoNumero);
 
         // Número para String
         String texto = String.valueOf(numInt);
         String textoAlternativo = "" + numInt;
 
         // ========== 7. MÉTODOS ÚTEIS ==========
 
         // Math
         double raiz = Math.sqrt(25);     // 5.0
         int maximo = Math.max(10, 20);   // 20
 
         // String
         String frase = " Java é poderoso ";
         frase.trim();                    // "Java é poderoso"
         frase.length();                  // 16
         frase.toUpperCase();             // " JAVA É PODEROSO "
     }
 }
 