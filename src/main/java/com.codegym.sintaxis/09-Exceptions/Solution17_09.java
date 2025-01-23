import java.io.IOException;
import java.rmi.RemoteException;
public class Solution17_09 {
    public static void main(String[] args){
            handleExceptions(new Solution17_09());


    }

    public static void handleExceptions(Solution17_09 obj)  {
        try{
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (IOException | NoSuchFieldException  e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
