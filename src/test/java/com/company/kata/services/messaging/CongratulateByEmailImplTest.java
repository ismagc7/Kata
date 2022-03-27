package com.company.kata.services.messaging;

import com.company.kata.models.employee.Employee;
import com.company.kata.services.employee.EmployeeService;
import com.company.kata.services.employee.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CongratulateByEmailImplTest {

    static final EmployeeService employeeService = new EmployeeServiceImpl();
    static final MessagingService emailService = new CongratulateByEmailImpl();
    //TODO: Should be implement
    static final MessagingService facebookService = new CongratulateByFacebookImpl();

    List<Employee> employes = new ArrayList<>();

    @Before
    public void prepareList() throws IOException {

        employes = employeeService.extractEmployees("EmployeesList");

    }

    @Test
    public void sendByEmailOK()
    {
       // TODO: Pending to refactor. The service prints the message in console, should returns the message to test it.

        //Assert.hasText("message", "The text to search");
    }

    @Test
    public void sendByEmailKO()
    {
        // TODO: Pending to refactor. The service prints the message in console, should returns the message to test it.

        //Assert.hasText("message", "The text to search");
    }

    @Test
    public void sendByFacebookOK()
    {
        // TODO: Pending to refactor. The service prints the message in console, should returns the message to test it.

        //Assert.hasText("message", "The text to search");
    }

    @Test
    public void sendByFacebookKO()
    {
        // TODO: Pending to refactor. The service prints the message in console, should returns the message to test it.

        //Assert.hasText("message", "The text to search");
    }

}
