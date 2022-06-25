package Lesson5;

public class Main {

    public static void main(String [] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  29);
        employees[1] = new Employee( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  43);
        employees[2] = new Employee( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  25);
        employees[3] = new Employee( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  54);
        employees[4] = new Employee( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  48);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }


    }

}
