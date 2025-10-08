public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Show() {
        System.out.println("Персона:");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }
}