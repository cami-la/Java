import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno.put("Nome", "Maria");
        aluno.put("Idade", "18");
        aluno.put("Media", "8.9");
        aluno.put("Turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        System.out.println(aluno.containsKey("Nome"));

    }
}
