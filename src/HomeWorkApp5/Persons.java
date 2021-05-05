package HomeWorkApp5;

public class Persons {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "892312312", 30000, 52);
        employee[1] = new Employee("Ivanov Sergey", "Engineer", "Sergey@mailbox.com", "892312313", 40000, 30);
        employee[2] = new Employee("Ivanov Oleg", "Engineer", "Oleg@mailbox.com", "892312314", 50000, 42);
        employee[3] = new Employee("Ivanov Artem", "Engineer", "Artem@mailbox.com", "892312315", 20000, 45);
        employee[4] = new Employee("Ivanov Alex", "Engineer", "Alex@mailbox.com", "+12 92312318", 10000, 30);
        for (Employee value : employee) {
            if (value.getAge() > 40) value.info();
        }
    }
}
