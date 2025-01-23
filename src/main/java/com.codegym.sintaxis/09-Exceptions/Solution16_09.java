import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution16_09 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args)throws IOException, CharConversionException, FileSystemException {
        try {
            handleExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e); // Log el FileSystemException en main
        }
    }

    public static void handleExceptions() throws FileSystemException{
        try {
            BEAN.throwExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e); // Log el FileSystemException
            throw e; // Relanzar el FileSystemException
        } catch (CharConversionException e) {
            BEAN.log(e); // Log el CharConversionException
        } catch (IOException e) {
            BEAN.log(e); // Log cualquier otro IOException
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            }
            if (i == 1) {
                throw new FileSystemException("");
            }
            if (i == 2) {
                throw new IOException();
            }
        }
    }
}
