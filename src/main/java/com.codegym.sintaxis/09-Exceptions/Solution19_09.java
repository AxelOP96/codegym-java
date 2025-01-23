import java.io.IOException;

public class Solution19_09 {
    public static void main(String[] args) {
    }

    static class MyException extends Exception{
    }
    //unchecked NullPointerException | IndexOutOfBoundsException
    //checked IOException | NoSuchFieldException
    static class MyException2 extends IOException{
    }

    static class MyException3 extends NullPointerException {
    }

    static class MyException4 extends IndexOutOfBoundsException{
    }
}
