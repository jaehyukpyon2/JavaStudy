public class SumOneToTen_GuGuDanSamDan {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("----------");

        int dan = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.printf(dan + " x " + i + " = %2d\n", (dan * i));
        }
    }
}
