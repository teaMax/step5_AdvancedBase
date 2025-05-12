package topic1_Generics.task3_Box;

public class BoxDemo {

    public static void main(String[] args) {
        Box<Integer> intValue = new Box<>();
        intValue.setValue(30);
        System.out.println(intValue.getValue());

        Box<String> strValue = new Box<>();
        strValue.setValue("Maxim");
        System.out.println(strValue.getValue());
        strValue.setValue("Vova");
        System.out.println(strValue.getValue());
    }
}
