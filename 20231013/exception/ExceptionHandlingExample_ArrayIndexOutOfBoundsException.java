package exception;

public class ExceptionHandlingExample_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과.");
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가.");
                e.printStackTrace();
            } finally {
                System.out.println("finally");
            }
        }
        /*
        * array[0]: 100
        finally
        숫자 변환 불가.
        finally
        배열 인덱스 초과.
        finally
        * */
    }
}
