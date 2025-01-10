import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution09_08 {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for(int i=0;i<10000;i++)
            list.add("Element");

    }

    public static void get10000(List list) {
        //write your code here
        for(int i=0;i<10000;i++)
            System.out.println(list.get(i));
    }

    public static void set10000(List list) {
        for(int i=0;i<10000;i++)
            list.set(i, "New element");

    }

    public static void remove10000(List list) {
        int i=0;
        while(i<list.size()){
            list.remove(i);
        }

    }
}
