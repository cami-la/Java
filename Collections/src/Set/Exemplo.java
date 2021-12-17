package Set;
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString()); // "toString()" opcional

        System.out.println("Exiba a posição da nota 5.0: "); // A solicitação referente à esta saída não poderá ser
        // impressa porque Hashset não possui métodos com índices

        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // A solicitação referente à esta saída não poderá ser
        // impressa porque Hashset não possui métodos com índices ("posição 4")

        System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // A solicitação referente à esta saída não poderá ser
        // impressa porque Hashset não possui métodos com índices (uso do Get para acesso ao elemento)

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada: "); // A solicitação referente à esta saída não poderá ser
        // impressa porque Hashset não possui métodos com índices

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); // Uso da Interface Iterator para exibir soma dos elementos
        Double soma = 0.0;

        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0"); // A solicitação referente à esta saída não poderá ser
        // impressa porque Hashset não possui métodos com índices

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(); // Hashset insere elementos em ordem aleatória, e deseja-se colocar
        // os elementos em ordem de inserção
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); // Deseja-se inserir elementos em ordem natural, pelo tipo de elemento
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}