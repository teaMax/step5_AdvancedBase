package topic2_Exceptions.task5_Finally;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("Ресурс открыт");

            //для ошибки
            int a = 10;
            int b = 0;
            //System.out.println(a/b);
        } catch(Exception e) {
            throw e;
        } finally {
            System.out.println("Ресурс закрыт");
        }
    }
}
