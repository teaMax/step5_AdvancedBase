package topic1_Generics.task3_Box;

public class Box<T> {
    private T value;

    public Box() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
