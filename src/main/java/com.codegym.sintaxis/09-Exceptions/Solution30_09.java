import java.io.*;
public class Solution30_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();

            InputStream fileInputStream;
            try {
                fileInputStream = getInputStream(sourceFileName);
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist.");
                return; // Terminar el programa si el archivo no existe
            }

            OutputStream fileOutputStream = getOutputStream(destinationFileName);
            int count = 0;
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
                count++;
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
