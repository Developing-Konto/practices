package com.example;

import com.example.domain.*;
import com.example.domain.business.EmployeeStockPlan;

public class EmployeeTest {

   public static void main(String[] args) {
      Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678",
                                       120_345.27);
      EmployeeStockPlan employeeStockPlan = new EmployeeStockPlan();
      printEmployee(engineer, employeeStockPlan);

   }

   public static void printEmployee(Employee employee) {
      System.out.println(employee.toString());
   }


   public static void printEmployee(Employee employee,
                                    EmployeeStockPlan employeeStockPlan) {

      printEmployee(employee);
      System.out
         .println("Stock options: " + employeeStockPlan.grantStock(employee));

   }

}
