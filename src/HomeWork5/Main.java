package HomeWork5;

import Lesson5.Employee;

public class Main {

    public static void main(String [] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  29);
        persons[1] = new Person( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  43);
        persons[2] = new Person( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  25);
        persons[3] = new Person( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  54);
        persons[4] = new Person( "Ivanov Ivan",  "Engineer", "ivivan@mail.ru", "89765556423", 30000,  48);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                persons[i].info();
            }
        }


    }

}






