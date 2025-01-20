import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution15_08 {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> lista = new HashSet<>();
        lista.add(12);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(11);
        lista.add(1201);
        lista.add(12003);
        lista.add(124);
        lista.add(1244);
        lista.add(123);
        lista.add(312);
        lista.add(122);
        lista.add(12444);
        lista.add(125);
        lista.add(1266);
        lista.add(12000);
        lista.add(1200);
        lista.add(120);
        lista.add(129);
        lista.add(128);
        return lista;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterador = set.iterator();
        while(iterador.hasNext()){
            if(iterador.next() >10){
                iterador.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> lista = createSet();

        HashSet<Integer> listaFinal = removeAllNumbersGreaterThan10(lista);
        for(Integer show : listaFinal){
            System.out.println(show);
        }
    }
}
