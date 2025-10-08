public class Dollar extends Currency {
    private static final double RATE = 41.2; // умовний курс USD → UAH

    public Dollar(double amount) {
        super(amount);
    }

    @Override
    public double toUAH() {
        return amount * RATE;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("USD: %.2f ($) = %.2f грн", amount, toUAH());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dollar other = (Dollar) obj;
        return Double.compare(other.amount, amount) == 0;
    }
}