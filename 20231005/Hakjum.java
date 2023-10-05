import java.util.Scanner;

public class Hakjum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학점을 입력하세요. >> ");
        int hakjum = Integer.parseInt(scanner.nextLine());

        if (hakjum >= 90) {
            System.out.println("A학점입니다");
        } else if (hakjum >= 80) {
            System.out.println("B학점입니다");
        } else if (hakjum >= 70) {
            System.out.println("C학점입니다");
        } else if (hakjum >= 60) {
            System.out.println("D학점입니다");
        } else {
            System.out.println("F");
        }
    }
}
