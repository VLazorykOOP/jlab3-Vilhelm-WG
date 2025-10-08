import java.util.Scanner;

public class Task1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість осіб: ");
        int n = sc.nextInt();
        sc.nextLine(); // спожити новий рядок

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nОб'єкт №" + (i + 1));
            System.out.println("1 - Студент");
            System.out.println("2 - Викладач");
            System.out.println("3 - Завідувач кафедри");
            System.out.print("Ваш вибір: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Ім'я: ");
            String name = sc.nextLine();
            System.out.print("Вік: ");
            int age = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Факультет: ");
                    String faculty = sc.nextLine();
                    System.out.print("Курс: ");
                    int course = sc.nextInt();
                    sc.nextLine();
                    people[i] = new Student(name, age, faculty, course);
                    break;
                case 2:
                    System.out.print("Предмет: ");
                    String subject = sc.nextLine();
                    System.out.print("Стаж (роки): ");
                    int exp = sc.nextInt();
                    sc.nextLine();
                    people[i] = new Teacher(name, age, subject, exp);
                    break;
                case 3:
                    System.out.print("Кафедра: ");
                    String dept = sc.nextLine();
                    System.out.print("Років на посаді: ");
                    int years = sc.nextInt();
                    sc.nextLine();
                    people[i] = new HeadOfDepartment(name, age, dept, years);
                    break;
                default:
                    System.out.println("Невірний вибір. Створюється базовий об'єкт Person.");
                    people[i] = new Person(name, age);
            }
        }

        System.out.println("\n=== Введені об'єкти ===");
        for (Person p : people) {
            p.Show();
            System.out.println("-------------------");
        }

        sc.close();
    }
}