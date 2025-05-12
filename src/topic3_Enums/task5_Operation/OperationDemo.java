package topic3_Enums.task5_Operation;

public class OperationDemo {
    public static void main(String[] args) {
        double x = 45.6;
        double y = 8.8;
        double Result;

        Result = Operation.MINUS.apply(x, y);
        System.out.println("Результат вычитания: " + Result);

        Result = Operation.PLUS.apply(x, y);
        System.out.println("Результат сложения: " + Result);

        Result = Operation.TIMES.apply(x, y);
        System.out.println("Результат умножения: " + Result);

        Result = Operation.DIVIDE.apply(x, y);
        System.out.println("Результат деления: " + Result);

    }
}
