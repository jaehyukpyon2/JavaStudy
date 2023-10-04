import java.util.Scanner;

public class GuGuDanUserInputLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("구구단 몇 단을 출력하시겠습니까? (숫자 0 또는 1을 누루면 종료합니다.)");
            int dan = Integer.parseInt(scanner.nextLine());
            if (dan == 0 || dan == 1) {
                System.out.println("숫자 0 또는 1을 입력하여 종료되었습니다.");
                break;
            }
            for (int i = 1; i <= 9; i++) {
                System.out.printf(dan + " x " + i + " = %2d\n", (dan * i));
            }
        }
    }
}
