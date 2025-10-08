public class Euro extends Currency {
    private static final double RATE = 43.5; // умовний курс EUR → UAH

    public Euro(double amount) {
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
        return String.format("EUR: %.2f (€) = %.2f грн", amount, toUAH());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Euro other = (Euro) obj;
        return Double.compare(other.amount, amount) == 0;
    }
}