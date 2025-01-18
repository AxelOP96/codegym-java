import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutions27_08 {
    //Five winners
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int limit = array.length;
        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Intercambiar si el elemento actual es menor que el siguiente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
