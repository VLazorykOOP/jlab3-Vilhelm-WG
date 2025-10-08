import java.time.LocalDate;

public class DateTriad implements Triad {
    private LocalDate date;

    public DateTriad(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    @Override
    public void increase() {
        // Збільшуємо дату на 1 день
        date = date.plusDays(1);
    }

    @Override
    public void print() {
        System.out.println("Дата: " + date);
    }
}