package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandlingExample_File {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (IOException e) {
            System.out.println("in catch block");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
