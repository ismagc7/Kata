package com.company.kata.services.employee;

import com.company.kata.models.employee.Employee;
import com.company.kata.services.employee.validator.EmployeeValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public List<Employee> extractEmployees(String fileName) throws IOException {

        EmployeeValidator employeeValidator = new EmployeeValidator();

        List <Employee> employees = new ArrayList<>();

        boolean firstLine = true;

        String rowText;
        FileReader file = new FileReader ("/Users/ismaelgutierrezcasao/Desktop/Kata/src/main/java/com/company/kata/files/" + fileName);
        BufferedReader reader = new BufferedReader(file);

        try
        {
            while ((rowText = reader.readLine()) != null && rowText.length()!=0)
            {
                if (!firstLine)
                {
                    Employee singleOne = new Employee();

                    String [] partsOfEmployee = rowText.split(",");

                    singleOne.setLastName(partsOfEmployee[1]);
                    singleOne.setFirstName(partsOfEmployee[0]);
                    singleOne.setBirthday(partsOfEmployee[2]);
                    singleOne.setEmail(employeeValidator.validateEmail(partsOfEmployee[3]));

                    employees.add(singleOne);
                }
                firstLine = false;

            }

        }catch(Exception e)
        {
            e.printStackTrace(System.out);
        }
        finally {
            reader.close();
        }

        return employees;
    }
}
