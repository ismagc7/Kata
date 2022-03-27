package com.company.kata.services.employee;

import com.company.kata.models.employee.Employee;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class EmployeeServiceImplTest {

    static final EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    public void extractEmployeesFromFileOK () throws IOException {

        List<Employee> employeeList = employeeService.extractEmployees("EmployeesList");

        Assert.assertEquals(5,employeeList.size());
    }

    @Test
    public void extractEmployeesFromFileOtherFile () throws IOException {

        List<Employee> employeeList = employeeService.extractEmployees("EmployeesListOtherFile");

        Assert.assertEquals(2,employeeList.size());
    }

}
