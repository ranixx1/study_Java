//Área de um triângulo:
//Leia a base e a altura de um triângulo e calcule sua área.
//Fórmula: Área = (base * altura) / 2
package lista1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do triângulo:");
        float base = scanner.nextFloat();
        System.out.print("Digite a altura do triângulo:");
        float altura = scanner.nextFloat();
        float area= (base*altura) /2;
        System.out.println("a area do triângulo é:" + area);
        scanner.close();
    }

    
}
