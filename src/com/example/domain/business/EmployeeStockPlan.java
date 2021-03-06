package com.example.domain.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;


public class EmployeeStockPlan {


   private final int EMPLOYEE_SHARES = 10;
   private final int MANAGER_SHARES = 100;
   private final int DIRECTOR_SHARES = 1000;


   public int grantStock(Employee employee) {
      if (employee instanceof Director) return DIRECTOR_SHARES;
      if (employee instanceof Manager) return MANAGER_SHARES;
      return EMPLOYEE_SHARES;
   }
}
