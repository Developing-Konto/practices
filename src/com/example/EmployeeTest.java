package com.example;

import com.example.domain.*;

public class EmployeeTest {

   public static void main(String[] args) {
      Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678",
                                       120_345.27);

      Manager manager = new Manager(207, "Barbara Johnson", "052-12-2367",
                                    109_501.36, "US Marketing");

      Admin admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

      Director director = new Director(12, "Susan Wheeler", "099-45-2340",
                                       120_567.36, "Global Marketing",
                                       1_000_000.00);




      engineer.printEmployee();
      manager.printEmployee();
      admin.printEmployee();
      director.printEmployee();


      manager.setName("Barbara Johnson-Smythe");
      manager.raiseSalary(10_000.00);
      manager.printEmployee();



   }
}
