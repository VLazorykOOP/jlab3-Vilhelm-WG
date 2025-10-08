public class HeadOfDepartment extends Person {
    private String department;
    private int yearsInPosition;

    public HeadOfDepartment(String name, int age, String department, int yearsInPosition) {
        super(name, age);
        this.department = department;
        this.yearsInPosition = yearsInPosition;
    }

    @Override
    public void Show() {
        System.out.println("Завідувач кафедри:");
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Кафедра: " + department);
        System.out.println("Років на посаді: " + yearsInPosition);
    }
}