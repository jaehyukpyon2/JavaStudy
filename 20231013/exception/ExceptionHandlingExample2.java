package exception;

public class ExceptionHandlingExample2 {

    public static void main(String[] args) {
        System.out.println("start");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("end");
    }

    private static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("length: " + data.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally.");
        }
    }
}
