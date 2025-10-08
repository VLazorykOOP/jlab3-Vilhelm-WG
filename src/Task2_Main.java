public class Main {
    public static void main(String[] args) {
        // Створюємо масив валют різних типів
        Currency[] currencies = new Currency[4];
        currencies[0] = new Dollar(100);
        currencies[1] = new Euro(50);
        currencies[2] = new Dollar(100);
        currencies[3] = new Euro(75);

        // Вивід інформації про всі об’єкти
        System.out.println("=== Інформація про валюту ===");
        for (Currency c : currencies) {
            c.printInfo();
        }

        // Перевірка роботи equals
        System.out.println("\n=== Перевірка equals ===");
        System.out.println("currencies[0] == currencies[2]: " + currencies[0].equals(currencies[2]));
        System.out.println("currencies[1] == currencies[3]: " + currencies[1].equals(currencies[3]));
        System.out.println("currencies[0] == currencies[1]: " + currencies[0].equals(currencies[1]));

        // Перевірка конвертації в гривні
        System.out.println("\n=== Конвертація в гривні ===");
        for (Currency c : currencies) {
            System.out.printf("%s → %.2f грн%n", c.getClass().getSimpleName(), c.toUAH());
        }
    }
}