import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution15_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i< 20; i++){
            lista.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> divisible3 = new ArrayList<>();
        ArrayList<Integer> divisible2 = new ArrayList<>();
        ArrayList<Integer> divisibleByAnythingElse = new ArrayList<>();
        for(Integer divisible : lista){
            if(divisible % 2 == 0 || divisible % 3 == 0){
                if(divisible % 3 == 0){
                    divisible3.add(divisible);
                }
                if(divisible % 2 == 0){
                    divisible2.add(divisible);
                }
            }
            else{
                divisibleByAnythingElse.add(divisible);
            }
        }
        printList(divisible3);
        printList(divisible2);
        printList(divisibleByAnythingElse);
    }
    public static void printList(List<Integer> list) {
        for(Integer number : list){
            System.out.println(number);
        }
    }

}
