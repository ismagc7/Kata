package com.company.kata.services.messaging;

import com.company.kata.models.employee.Employee;
import com.company.kata.services.employee.validator.EmployeeValidator;

import java.text.ParseException;
import java.util.List;

public class CongratulateByEmailImpl implements MessagingService{

    static final EmployeeValidator employeeValidator = new EmployeeValidator();

    public void congratulate(List<Employee> employeeList) {

        employeeList.forEach(employee -> {

            try {
                if (employeeValidator.validateDate(employee.getBirthday()))
                {
                    if (!"El email ingresado es inválido.".equals(employee.getEmail()))
                    {
                        String mesage = "--------------------------------------------------------------"
                                + "\n"
                                + "Subject: Happy birthday!\n"
                                + "\n"
                                + "Happy birthday, dear " + employee.getFirstName()+ " " + employee.getLastName()+"!"
                                + "\n\n"
                                +"--------------------------------------------------------------";

                        System.out.println(mesage);
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }
}
