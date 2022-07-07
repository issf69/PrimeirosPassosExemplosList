/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/





# PrimeirosPassosExemplosList
Trabalhando com Collections Java
###  ackage primeirospassoslist.com.br;

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

### C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=58613:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Primeiros Passos Métodos List\primeiros.passos.exemplosList\out\production\primeiros.passos.exemplosList" primeirospassoslist.com.br.PrimeirosPassosExemplosList
Crie uma lista nota 2: 
[7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6]
Mostre a primeira nota da lista sem remove-l0: 7.0
Mostre a primeira nota da lista removendo:
Remova a primeira nota na posicao 0
[8.5, 9.3, 5.0, 7.0, 0.0, 3.6]

Process finished with exit code 0
