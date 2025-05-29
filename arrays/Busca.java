package arrays;

public class Busca {

    public static int buscaMenor(int[] arr) { // FUNÇÃO PARA ARMAZENAR O MENOR NUMERO
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int menor = arr[0]; // DEFINE O MENOR COMO 0
        int menorIndice = 0; // DEFINE O MENOR INDICE O 0

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i]; 
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static int[] ordenacaoPorSelecao(int[] arr) { // FUNÇÃO PARA ORDENAR
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMenorAtual = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMenorAtual]) {
                    indiceMenorAtual = j;
                }
            }

            if (indiceMenorAtual != i) {
                int temp = arr[i];
                arr[i] = arr[indiceMenorAtual];
                arr[indiceMenorAtual] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};

        System.out.println("Array original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] ordenado = ordenacaoPorSelecao(arr);

        System.out.println("Array ordenado:");
        for (int num : ordenado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}