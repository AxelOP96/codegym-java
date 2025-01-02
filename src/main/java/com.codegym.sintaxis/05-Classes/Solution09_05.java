import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution09_05{
    public static void main(String[] args) {
    MyFile file = new MyFile();
    file.initialize("c:\\data\\a.text");

    MyFile file2 = new MyFile();
    file2.initialize(file, "a.txt");
    String text = file2.readText();
    }
}

class MyFile {
    private String filePath;

    // Inicializa con una ruta de archivo
    public void initialize(String filePath) {
        this.filePath = filePath;
    }

    // Inicializa con otro MyFile y un nuevo nombre de archivo
    public void initialize(MyFile otherFile, String newFileName) {
        // Aquí, asumimos que simplemente asignamos un nuevo nombre, pero podrías modificar la ruta si fuera necesario
        this.filePath = otherFile.filePath.replace(otherFile.getFileName(), newFileName);
    }

    // Leer el contenido del archivo
    public String readText() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    // Método auxiliar para obtener solo el nombre del archivo
    private String getFileName() {
        int lastIndexOf = filePath.lastIndexOf("\\");
        return (lastIndexOf == -1) ? filePath : filePath.substring(lastIndexOf + 1);
    }
}