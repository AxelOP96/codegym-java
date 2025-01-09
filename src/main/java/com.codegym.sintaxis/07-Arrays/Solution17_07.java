import java.util.ArrayList;

public class Solution17_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Sam");
        lista.add("I");
        lista.add("Am");
        int i =0;
        while(i < lista.size()){
            String added = lista.get(i);
            if(added != null && !added.equals("Ham") ){
                lista.add(i+1,"Ham");
                i+=2;
            }else{
                i++;
            }
        }/*
        for(String added : lista){ //Es más optimo usar while
            if(added != null && !added.equals("Ham") ){
                lista.add(lista.indexOf(added)+1,"Ham");
            }
        }*/
        for(String show : lista){
            System.out.println(show);
        }
    }
}
