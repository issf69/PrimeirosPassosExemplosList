package primeirospassoslist.com.br;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class PrimeirosPassosExemplosList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista nota 2: ");

        List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2.toString());
        System.out.println("Mostre a primeira nota da lista sem remove-l0: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da lista removendo:");
        System.out.println("Remova a primeira nota na posicao 0");
        notas2.remove(7d);
        System.out.println(notas2);


    }
}
