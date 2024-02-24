public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        // Дополнительные проверки расчетов
        System.out.println();  // пустая строка
        System.out.println("Считаем для 13 676");
        System.out.println(service.calculate(13_676));
        System.out.println();  // пустая строка
        System.out.println("Считаем для 123 456");
        System.out.println(service.calculate(123_456));
    }
}
