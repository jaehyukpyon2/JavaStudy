package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionHandlingExample_File2 {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("file.txt")) {
        } catch (IOException e) {
            System.out.println("in catch block");
        } finally {

        }
    }
}
