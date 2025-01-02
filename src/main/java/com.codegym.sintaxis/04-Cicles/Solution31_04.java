import java.io.*;

public class Solution31_04{
    public static void main(String[] args) {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    Boolean shouldExit = false;
    while (!shouldExit) {
        try {
            String s = buffer.readLine();
            if (s != null && s.equals("exit")) {
                shouldExit = true; // Si se ingresa "exit", salimos del ciclo
            }
        } catch (IOException e) {
            System.out.println("Error leyendo la entrada: " + e.getMessage());
        }
    }
    }
}