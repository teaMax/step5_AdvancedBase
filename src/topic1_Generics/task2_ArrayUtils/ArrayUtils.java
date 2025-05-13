package topic1_Generics.task2_ArrayUtils;

public class ArrayUtils{
    public static <T> void swap(T[] array, int i, int j) {
        if(i < 0 || j < 0) {
            System.out.println("Один из индексов отрицательный");
            return;
        }
        if (array.length <= 1) {
            System.out.println("В array не хватает элементов");
            return;
        }
        if(i >= array.length || j >= array.length) {
            System.out.println("Один из индексов выходит за границы массива");
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
