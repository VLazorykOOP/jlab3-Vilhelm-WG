public class Task3_Main {
    public static void main(String[] args) {
        Triad date = new DateTriad(2025, 10, 8);
        Triad time = new TimeTriad(23, 59, 59);

        System.out.println("=== Початкові значення ===");
        date.print();
        time.print();

        // Збільшуємо обидва об'єкти на 1
        date.increase();
        time.increase();

        System.out.println("\n=== Після increase() ===");
        date.print();
        time.print();
    }
}