import java.util.ArrayList;

public class Solution08_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Me");
        lista.add("llamo");
        lista.add("AXEL");
        lista.add("Y este 2025");
        lista.add("Me recibo!!!!!");
        System.out.println(lista.size());
        for(String palabras : lista){
            System.out.println(palabras);
        }
    }
}
