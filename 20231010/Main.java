import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.print();

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        calculator.powerOn();
        System.out.print("더하기(+), 빼기(-), 곱하기(*), 나누기(/) 부호, 숫자 두 개 입력 >> ");

        String[] split = scanner.nextLine().trim().split(" ");
        String command = split[0];
        int x = Integer.parseInt(split[1]);
        int y = Integer.parseInt(split[2]);

        int result = 0;

        switch (command) {
            case "+":
                result = calculator.plus(x, y);
                break;
            case "-":
                result = calculator.minus(x, y);
                break;
            case "*":
                result = calculator.multiply(x, y);
                break;
            case "/":
                double result1 = calculator.divide(x, y);
                System.out.println(x + " / " + y + " = " + result1);
                calculator.powerOff();
                System.exit(0);
                break;
        }
        calculator.powerOff();
        System.out.println(x + " " + command + " " + y + " = " + result);
    }
}
