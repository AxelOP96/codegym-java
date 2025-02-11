import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Time for 10,000 inserts
public class Solution10_08 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // write your code here
        long startTime = System.currentTimeMillis();
        insert10000(list);

        // write your code here
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
