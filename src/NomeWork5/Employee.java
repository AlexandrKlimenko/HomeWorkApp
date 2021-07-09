package NomeWork5;

public class Employee {


    String fio;
    String position;
    String email;
    int telNumber;
    int theSalary;
    int age;

    public Employee(String fio, String position, String email, int telNumber, int theSalary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.theSalary = theSalary;
        this.age = age;
    }

    public void printEmployer() {
        System.out.printf("Employer: %s \nPosition: %s \n@mail: %s \nTel number: %d \nThe salarey: %d \nAge: %d \n", fio, position, email, telNumber, theSalary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                ", theSalary=" + theSalary +
                ", age=" + age +
                '}';
    }
}
