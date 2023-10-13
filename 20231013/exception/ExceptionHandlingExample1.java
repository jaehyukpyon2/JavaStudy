package exception;

public class ExceptionHandlingExample1 {

    public static void main(String[] args) {
        System.out.println("start");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("end");
    }

    private static void printLength(String data) {
        int result = data.length();
        System.out.println("length: " + data.length());
    }
}
