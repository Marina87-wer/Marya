package HomeWork5;

public class Person {

    public Person(String FIO, String prof, String email, String telephone, double salary, int age) {
        this.FIO = FIO;
        this.prof = prof;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String FIO;
    private String prof;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    public void info() {

        System.out.println("[" + FIO +", "+ prof +", "+ email +", "+ telephone +", "+ salary +", "+ age +" " + "]");
    }
}





