package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo_List {
    //dada uma lista com 7 notas de um aluno [7, 8.5, 9.3,5, 7, 0, 3.6]

    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posicao da nota 5.0: "+ notas.indexOf(5.0));

        System.out.println("adicione a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 por 6.0 : ");
        notas.set(notas.indexOf(5.0),6.0 );
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista : " + notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada : " + notas.get(2));

        System.out.println(notas);

        System.out.println(Collections.max(notas));

    }

}
