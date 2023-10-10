public class Calculator {

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(double x, double y) {
        int timesHundred = (int)((x / y) * 100);
        return (double) timesHundred / 100;
    }

    int minus(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }
}
