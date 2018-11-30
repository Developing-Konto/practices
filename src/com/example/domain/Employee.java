package com.example.domain;

import java.text.NumberFormat;

public class Employee {

   private int empId;
   private String name;
   private String ssn;
   private double salary;


   public Employee(int empId, String name, String ssn, double salary) {
      this.empId = empId;
      this.name = name;
      this.ssn = ssn;
      this.salary = salary;
   }

   public int getEmpId() {
      return empId;
   }


   public void setName(String name) {
      if (null != name && !name.isEmpty())
         this.name = name;
   }

   public String getName() {
      return name;
   }


   public String getSsn() {
      return ssn;
   }


   public double getSalary() {
      return salary;
   }

   public void raiseSalary(double increase) {
      if (increase >= 0)
         salary += increase;
   }


   public void printEmployee() {
      System.out.println("Employee{" +
                            "empId=" + getEmpId() +
                            ", name='" + getName() + '\'' +
                            ", ssn='" + getSsn() + '\'' +
                            ", salary=" + NumberFormat.getCurrencyInstance()
                                                      .format(
                                                         (double) getSalary()) +
                            '}');
   }
}
