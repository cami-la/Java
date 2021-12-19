package Set;
import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;

vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
*/

public class EP_1 {
    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<>();
        cores.add("vermelha");
        cores.add("laranja");
        cores.add("amarela");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");

        System.out.println("\n-- Exiba todas as cores o arco-íris uma abaixo da outra --");
        for (String cor:cores) {
            System.out.println(cor);
        }

        System.out.println("\n-- A quantidade de cores que o arco-íris tem --");
        System.out.println(cores.size());

        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println("\n-- Exiba as cores em ordem alfabética --");
        System.out.println(cores2);

        Set<String> cores3 = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        List<String> cores3I = new ArrayList<>(cores3);
        Collections.reverse(cores3I);
        System.out.println("\n-- Exiba as cores na ordem inversa da que foi informada --");
        System.out.println(cores3I);

        System.out.println("\n-- Exiba todas as cores que começam com a letra ”v” --");
        for (String cor2:cores) {
            if (cor2.startsWith("v"))
                System.out.println(cor2);
        }

        System.out.println("\n-- Remova todas as cores que não começam com a letra “v” --");


    }
}
