package poo.lista2.bingo;
import java.util.*;

public class Bingo {
    private int numBolas;
    private List<Integer> bolas;
    private Set<Integer> sorteados;

    public Bingo() {
        this.numBolas = 75;
        this.bolas = new ArrayList<>(this.numBolas);
        this.sorteados = new HashSet<>();
        iniciar(this.numBolas);
    }

    private void iniciar(int numBolas) {
        this.bolas.clear();
        for(int i = 1; i <= this.numBolas; i++) {
            this.bolas.add(i);
        }
        Collections.shuffle(this.bolas);
    }

    public int proximo() {
        if(this.bolas.isEmpty()) {
            return -1;
        }
        var bola = this.bolas.removeFirst();
        this.sorteados.add(bola);
        return bola;
    }

    public Set<Integer> getSorteados() {
        /* '.unmodifiableSet' : não permitir que o conjunto de bolas sorteadas
            possa ser modificada fora da classe.
         */
        return Collections.unmodifiableSet(this.sorteados);
    }
}