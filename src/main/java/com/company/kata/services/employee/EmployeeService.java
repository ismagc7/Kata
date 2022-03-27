package com.company.kata.services.employee;

import com.company.kata.models.employee.Employee;


import java.io.IOException;
import java.util.List;

public interface EmployeeService {

    List<Employee> extractEmployees (String fileName) throws IOException;
}
