package com.company.kata.services.messaging;

import com.company.kata.models.employee.Employee;

import java.util.List;

public interface MessagingService {

    void congratulate(List<Employee> employeeList);
}
