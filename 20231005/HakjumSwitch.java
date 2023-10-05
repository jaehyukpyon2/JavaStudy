import java.util.Scanner;

public class HakjumSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학점을 입력하세요. >> ");
        int hakjum = Integer.parseInt(scanner.nextLine());

        switch (hakjum / 10) {
            case 10:
            case 9:
                System.out.println("A학점입니다");
                break;
            case 8:
                System.out.println("B학점입니다");
                break;
            case 7:
                System.out.println("C학점입니다");
                break;
            case 6:
                System.out.println("D학점입니다");
                break;
            default:
                System.out.println("F학점입니다");
                break;
        }
    }
}
