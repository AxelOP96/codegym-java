import java.util.ArrayList;

public class Solution18_07 {
    public static void main(String[] args) throws Exception {
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
        // 1. Create a list of words and populate it yourself.
        //2. The fix method should:
        //2.1. remove all words containing the letter "r" from the list
        //2.2. duplicate all words containing the letter "l".
        //2.3. if a word contains both "r" and "l", then leave it unchanged.
        //2.4. don't do anything to other words.
        int i =0;
        while(i< list.size()){
        //for(String word : list){
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
