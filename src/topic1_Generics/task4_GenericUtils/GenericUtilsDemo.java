package topic1_Generics.task4_GenericUtils;

public class GenericUtilsDemo {
    public static void main(String[] args) {
        String strFirst = "Top";
        String strSecond = "Boxer";
        System.out.println("Большее из двух слов лексикографически: " + GenericUtils.max(strFirst, strSecond));

        Integer a = 10;
        Integer b = 7;
        System.out.println("Большее из двух значение: " + GenericUtils.max(a, b));
    }
}
