package poo.lista2.playlist;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> musicas;

    public Playlist() {
        musicas = new ArrayList<>();
    }

    public void inserir(Musica m) {
        musicas.add(m);
        System.out.println("Música adicionada!");
    }

    public void excluir(String nome) {
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getNome().equalsIgnoreCase(nome)) {
                musicas.remove(i);
                System.out.println("Música removida!");
                return;
            }
        }
        System.out.println("Música não encontrada.");
    }

    public void listar() {
        if (musicas.isEmpty()) {
            System.out.println("Playlist vazia.");
            return;
        }

        System.out.println("---- Playlist ----");
        for (Musica m : musicas) {
            System.out.println(m);
        }
    }

    public int tempoTotal() {
        int total = 0;
        for (Musica m : musicas) {
            total += m.getDuracao();
        }
        return total;
    }
}
