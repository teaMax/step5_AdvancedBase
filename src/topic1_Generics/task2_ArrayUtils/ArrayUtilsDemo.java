package topic1_Generics.task2_ArrayUtils;

import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3, 4, 5};
        ArrayUtils.swap(array1,3,4);
        System.out.println(Arrays.toString(array1));

        String[] array ={"Ola", "Costa", "Rica", "New", "York"};
        ArrayUtils.swap(array, 1,2);
        System.out.println(Arrays.toString(array));


    }
}
