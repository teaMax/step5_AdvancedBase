package topic3_Enums.task4_Season;

public class SeasonDemo {
    public static void main(String[] args) {
        for(Season season: Season.values()) {
            System.out.println(season.toString());
        }
    }
}
