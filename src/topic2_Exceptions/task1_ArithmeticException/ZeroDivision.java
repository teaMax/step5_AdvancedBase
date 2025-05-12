package topic2_Exceptions.task1_ArithmeticException;

public class ZeroDivision {
    public static void main(String[] args) throws Exception {
        int a = 100;
        int b = 0;
        try {
           int res = a / b;
        } catch (ArithmeticException e) {
            throw new Exception("Попытка разделить на 0 увенчалась провалом");
        }
    }
}
