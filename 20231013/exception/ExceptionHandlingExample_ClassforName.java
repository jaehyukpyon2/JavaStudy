package exception;

public class ExceptionHandlingExample_ClassforName {

    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String2");
            System.out.println("exist!");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}
