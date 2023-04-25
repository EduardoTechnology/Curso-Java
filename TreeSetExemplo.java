import java.util.TreeSet;
import  java.util.Iterator;
public class TreeSetExemplo {

	public static void main(String[] args) {
        // Criar TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();

        // Adicionar elementos
        treeSet.add("uva");
        treeSet.add("abacaxi");
        treeSet.add("kiwi");

        // Imprimir o TreeSet
        System.out.println(treeSet);

        // Remover um elemento do TreeSet
        treeSet.remove("kiwi");

        // Imprimir o TreeSet sem o kiwi
        System.out.println(treeSet);
        
        treeSet.add("kiwi");

        // Acessar o primeiro elemento do TreeSet
        String first = treeSet.first();
        System.out.println("Primeiro elemento: " + first);

        // Acessar o último elemento do TreeSet
        String last = treeSet.last();
        System.out.println("Último elemento: " + last);

        // Checar se contém uva
        boolean contains = treeSet.contains("uva");
        System.out.println("Contém uva: " + contains);

        // Acessar o tamanho do TreeSet
        int size = treeSet.size();
        System.out.println("Tamanho do set: " + size);
        
        
        
        //Realizar a iteração
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Acessar todos os elementos acima de abacaxi contando com ele
        System.out.println(treeSet.tailSet("abacaxi"));
        
        //Acessar todos os elementos abaixo de uva sem contar o último elemento
        System.out.println(treeSet.headSet("uva"));
        
        //Acessar os elementos na range definida sem contar o último elemento
        System.out.println(treeSet.subSet("abacaxi", "uva"));
        
        //System.out.println(treeSet.descendingSet());
        //Criar um treeset em ordem descendente
        TreeSet<String> treeSetDescending = (TreeSet<String>)treeSet.descendingSet();
        System.out.println(treeSetDescending);
      
        
        
        
        
    }
}