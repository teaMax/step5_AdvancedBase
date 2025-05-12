package topic2_Exceptions.task2_InvalidAgeException;

public class AgeCreator {
    public static void main(String[] args) throws InvalidAgeException {
        checkAge(130);
        checkAge(160);//здесь происходит Exception
        checkAge(-10);
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 150) {
            throw new InvalidAgeException("Вы указали некорректный возраст!");
        }
        System.out.println("Возраст корректный");
    }
}
