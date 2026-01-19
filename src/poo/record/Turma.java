package poo.record;
import java.util.List;
public record Turma(String nome, List<String> alunos) {
    public Turma {
        // Torna a lista imutável
        alunos = List.copyOf(alunos);
    }
}

class Main{
    public static void main(String[] args) {
        Turma turma = new Turma("Matemática", List.of("Ana","João","Maria"));
        System.out.println(turma.alunos());
    }
}