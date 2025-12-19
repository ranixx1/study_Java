package poo.prova.q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Assalariado("Ana", 3000));
        funcionarios.add(new Comissionado("Bruno", 4000, 2000));
        funcionarios.add(new Comissionado("Carla", 4500, 5000));

        Funcionario maiorSalario = funcionarios.get(0);

        for (Funcionario f : funcionarios) {
            System.out.println(f);

            if (f.calcularSalario() > maiorSalario.calcularSalario()) {
                maiorSalario = f;
            }
        }

        System.out.println(
            "Maior salário: " + maiorSalario.nome +
            " (" + maiorSalario.getClass().getSimpleName() + ")"
        );
    }
}

