public class Student extends Person {
    private String faculty;
    private int course;

    public Student(String name, int age, String faculty, int course) {
        super(name, age);
        this.faculty = faculty;
        this.course = course;
    }

    @Override
    public void Show() {
        System.out.println("Студент:");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
    }
}