public abstract class Currency {
    protected double amount; // сума у відповідній валюті

    public Currency(double amount) {
        this.amount = amount;
    }

    // Абстрактний метод переведення суми в гривні
    public abstract double toUAH();

    // Абстрактний метод для виведення інформації
    public abstract void printInfo();

    public double getAmount() {
        return amount;
    }
}