public class Main {
    public static void main(String[] args) {
    BonusMilesService service = new BonusMilesService();
    int price = 13676;
    int chek = 20;
    int myBonus = service.calculate(price, chek);
        System.out.println("Количество начисленных бонусов" + -myBonus);
    }
}