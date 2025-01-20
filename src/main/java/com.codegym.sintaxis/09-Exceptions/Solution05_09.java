public class Solution05_09 {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTrace  = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        return stackTrace.length;
    }
}
