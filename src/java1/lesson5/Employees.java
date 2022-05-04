package java1.lesson5;

public class Employees {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];

        Employees[0] = new Employee("Иванов Иван Иванович", "Начальник управления", "aa@aa.ru", "+79261234567", 120000, 45);
        Employees[1] = new Employee("Петров Петр Петрович", "Начальник отдела", "bb@bb.ru", "+79267654321", 100000, 35);
        Employees[2] = new Employee("Сидоров Сидр Сидорович", "Начальник сектора", "cc@cc.ru", "+79263451267", 80000, 30);
        Employees[3] = new Employee("Горбатов Иван Иванович", "Специалист", "dd@dd.ru", "+79261267345", 60000, 50);
        Employees[4] = new Employee("Кривошеин Иван Иванович", "Специалист", "ee@ee.ru", "+79266712345", 60000, 60);

        for (Employee e : Employees) {
            if (e.getAge() > 40) {
                System.out.println(e);
            }
        }
    }
}
