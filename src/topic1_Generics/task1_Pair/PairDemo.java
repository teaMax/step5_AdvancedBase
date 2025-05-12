package topic1_Generics.task1_Pair;

public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Max");
        Pair<Integer, String> pair2 = new Pair<>(2, "Masha");
        System.out.println(pair1);
        System.out.println(pair2);

        pair1.setSecond("Maxim");
        System.out.println(pair1.getSecond());

        pair1.setFirst(123);
        System.out.println(pair1.getFirst());
    }
}
