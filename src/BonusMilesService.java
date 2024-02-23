public class BonusMilesService {
    public int calculate(int price) {
        int minimumBonus = 20;
        int result;
        result = price / minimumBonus;
        return result;
    }
}
