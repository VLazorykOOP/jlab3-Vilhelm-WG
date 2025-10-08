public class Teacher extends Person {
    private String subject;
    private int experience; // роки стажу

    public Teacher(String name, int age, String subject, int experience) {
        super(name, age);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public void Show() {
        System.out.println("Викладач:");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Предмет: " + subject);
        System.out.println("Стаж: " + experience + " років");
    }
}