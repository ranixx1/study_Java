package exercicios.lista2;

public class ClassApresentarjava {
    public static void main(String[]args){
        String apresentacao = ApresentarPessoa();
        System.out.println(apresentacao);
    }

    public static String ApresentarPessoa(){
        String name = "Ranilton";
        int age = 20;

        return"Olá, meu nome é " + name + " tenho "+ age + " anos";
    }
}
