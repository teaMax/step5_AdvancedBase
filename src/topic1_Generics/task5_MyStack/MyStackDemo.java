package topic1_Generics.task5_MyStack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        System.out.println("myStack пустой? " + myStack.isEmpty());

        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        myStack.push("fourth");
        myStack.push("fifth");

        System.out.println("myStack пустой? " + myStack.isEmpty());

        System.out.println("Удаление и получение последнего элемента: " + myStack.pop());
        System.out.println("Получение последнего элемента: " + myStack.peek());
        System.out.println("Удаление и получение последнего элемента: " + myStack.pop());
        System.out.println("Удаление и получение последнего элемента: " + myStack.pop());
        System.out.println("Удаление и получение последнего элемента: " + myStack.pop());
        System.out.println("Удаление и получение последнего элемента: " + myStack.pop());

        System.out.println("myStack пустой? " + myStack.isEmpty());

    }
}
