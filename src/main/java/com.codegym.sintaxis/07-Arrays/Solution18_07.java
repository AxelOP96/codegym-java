import java.util.ArrayList;

public class Solution18_07 {
    public static void main(String[] args) throws Exception {
        //R or l
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("juan");
        list.add("axel");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        int i =0;
        while(i< list.size()){
            String word = list.get(i);
            if(word.contains("r") && !word.contains("l")){
                list.remove(word);
                i--;
            }
            else if(word.contains("l") && !word.contains("r")){
                list.add(list.indexOf(word)+1,word);
                i++;
            }
            i++;
        }
        return list;
    }
}
