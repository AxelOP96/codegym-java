public class Solution06_09 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String method = Thread.currentThread().getStackTrace()[2].getMethodName();
        String log = className + ": " + method + ": " +s;
        System.out.println(log);
    }
}
