package topic1_Generics.task5_MyStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private final List<T> arrayList = new ArrayList<>();

    public void push(T element) {
        arrayList.add(element);
    }

    public T pop() {
        return (!arrayList.isEmpty()) ? arrayList.removeLast() : null;
    }

    public T peek() {
        return (!arrayList.isEmpty()) ? arrayList.getLast() : null;
    }

    public boolean isEmpty() {
        return (arrayList.isEmpty());
    }
}
