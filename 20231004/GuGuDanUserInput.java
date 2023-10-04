import java.util.Scanner;

public class GuGuDanUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 몇 단을 출력하시겠습니까? ");
        int dan = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            System.out.printf(dan + " x " + i + " = %2d\n", (dan * i));
        }
    }
}
