package topic3_Enums.task3_Planet;

public class PlanetDemo {
    public static void main(String[] args) {
        for(Planet planet: Planet.values()) {
            System.out.println("На планете " + planet +
                    " гравитация составляет: " +
                    planet.surfaceGravity());
        }
    }
}
