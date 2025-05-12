package topic2_Exceptions.task4_MultiExceptionDemo;

public class MultiExceptionDemo {
    public static void main(String[] args) throws Exception {
        int[] intArray = new int[10];
        try {
            intArray[11] = 1;
            int temp = intArray[1];
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            throw new Exception("ошибка!" + e.getMessage());
        }
    }
}
