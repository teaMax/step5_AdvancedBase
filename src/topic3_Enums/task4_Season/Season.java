package topic3_Enums.task4_Season;

public enum Season {
    WINTER(-17.4), SPRING(10.3),
    SUMMER(24.5), FALL(7.8);

    private double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Season: " + this.name() +
                ", Avg Temp: " + this.averageTemperature +
                "°C";
    }
}
