import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution15_08 {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> lista = new HashSet<>();
        return lista;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterador = set.iterator();
        while(iterador.hasNext()){
            if(iterador.next() >10){
                Integer numero = iterador.next();
                set.remove(numero);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> lista = createSet();
        lista.add(12);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(11);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        HashSet<Integer> listaFinal = removeAllNumbersGreaterThan10(lista);
        for(Integer show : listaFinal){
            System.out.println(show);
        }
    }
}
