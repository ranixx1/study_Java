package poo.lista2.bingo;
public class Main {
    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        System.out.println(bingo.proximo());
        System.out.println(bingo.proximo());
        System.out.println(bingo.proximo());
        System.out.println(bingo.proximo());
        System.out.println(bingo.proximo());
        System.out.println("Bolas sorteadas: " + bingo.getSorteados());
    }
}
