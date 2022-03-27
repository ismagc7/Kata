package com.company.kata;

import com.company.kata.models.employee.Employee;
import com.company.kata.services.employee.EmployeeService;
import com.company.kata.services.employee.EmployeeServiceImpl;
import com.company.kata.services.messaging.CongratulateByEmailImpl;
import com.company.kata.services.messaging.MessagingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;


@SpringBootApplication
public class KataApplication {


    public static void main(String[] args) throws IOException {

        MessagingService congratulateService = new CongratulateByEmailImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();

        List<Employee> employeesList = employeeService.extractEmployees("EmployeesList");
        congratulateService.congratulate(employeesList);
    }
}
