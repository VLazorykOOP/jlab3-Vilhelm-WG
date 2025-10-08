import java.time.LocalTime;

public class TimeTriad implements Triad {
    private LocalTime time;

    public TimeTriad(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    @Override
    public void increase() {
        // Збільшуємо час на 1 секунду
        time = time.plusSeconds(1);
    }

    @Override
    public void print() {
        System.out.println("Час: " + time);
    }
}