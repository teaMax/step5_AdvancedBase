package topic2_Exceptions.task4_MultiExceptionDemo;

import java.util.ArrayList;
import java.util.List;

public class MultiExceptionDemo {
    public static void main(String[] args) throws Exception {
        int[] intArray = new int[10];
        String val = null;
        try {
            intArray[11] = 1;
            val.trim();
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка!!! : " + e.getClass().getSimpleName());
        }
    }
}
