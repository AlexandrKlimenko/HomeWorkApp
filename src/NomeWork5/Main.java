package NomeWork5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov Ivan Ivanovich", "developer", "iv@nov.com", 5553322, 50000, 35);

        employee.printEmployer();

        System.out.println();


        Employee[] Employees = new Employee[5];
        Employees[0] = new Employee("Petrov P.I.", "driver", "pp@mm.com", 23318961, 30000, 41);
        Employees[1] = new Employee("Sidorov A.M.", "security", "io@mtt.com", 2219963, 45000, 32);
        Employees[2] = new Employee("Mikhailov O.B.", "photographer", "wd@op.com", 7455500, 60000, 55);
        Employees[3] = new Employee("Reshetnyak R.I.", "accountant", "vit@vvv.com", 3325556, 400000, 25);
        Employees[4] = new Employee("Skobelev P.N.", "driverr", "nam@rr.com", 3302994, 440000, 39);

        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].age > 40) {
                System.out.println(Employees[i]);
            }
            //       System.out.println(Arrays.toString(Employees));

        }
    }
}










