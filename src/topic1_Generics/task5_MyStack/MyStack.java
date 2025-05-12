package topic1_Generics.task5_MyStack;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public void push(T element) {
        arrayList.add(element);
    }

    public T pop() {
        T lastElement = arrayList.getLast();
        arrayList.removeLast();
        return lastElement;
    }

    public T peek() {
        return arrayList.getLast();
    }

    public boolean isEmpty() {
        return (arrayList.isEmpty());
    }
}
