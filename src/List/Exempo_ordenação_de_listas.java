package List;

import java.util.*;

public class Exempo_ordenação_de_listas {
    public static void main(String[] args) {


        List<Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("jon",3, "preto"));
           add(new Gato("Simba",4, "tigrado"));
           add(new Gato("jon",5, "preto"));
        }};// criando dados atraves do ArrayList

        System.out.println(meusGatos);// imprimindo os dados

        System.out.println("--\tOrdem Aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem natural  (nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem natural (idade)\t---");
        meusGatos.sort(new comparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem natural (cor)\t---");
        meusGatos.sort(new comparatorColor());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String name;
    private int age;
    private String color;

    public Gato(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getName().compareToIgnoreCase(gato.getName());
    }
}

class comparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}

class comparatorColor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}

class comparatorNameCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if (name != 0) return name;

        int color = g1.getColor().compareToIgnoreCase(g2.getColor());
        if (color!= 0) return color;

        return Integer.compare(g1.getAge(), g2.getAge());
    }
}
