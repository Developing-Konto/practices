package com.example.domain.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeStockPlan {

   public int grantStock(Employee employee) {
      if (employee instanceof Director) return 1000;
      if (employee instanceof Manager) return 100;
      return 1;
   }
}
