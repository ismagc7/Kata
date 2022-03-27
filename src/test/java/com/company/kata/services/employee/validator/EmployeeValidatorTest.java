package com.company.kata.services.employee.validator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeValidatorTest {

    static final EmployeeValidator validator = new EmployeeValidator();

    @Test
    public void validateEmailOK ()
    {
        String email = "prueba.test@foobar.com";
        String check = validator.validateEmail(email);

        Assert.assertEquals(email, check);
    }

    @Test
    public void validateEmailKO()
    {
        String email = "prueba.test@@foobar.com";
        String check = validator.validateEmail(email);

        Assert.assertEquals("El email ingresado es inválido.", check);
    }

    @Test
    public void validateEmailWithoutDot()
    {
        String email = "pruebatest@foobar.com";
        String check = validator.validateEmail(email);

        Assert.assertEquals("El email ingresado es inválido.", check);
    }

    @Test
    public void validateDateOK() throws ParseException {

        Date today = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");

        Boolean check = validator.validateDate(formater.format(today));

        Assert.assertEquals(true, check);
    }

    @Test
    public void validateDateKO() throws ParseException {

        Boolean check = validator.validateDate("1994/03/23");
        Assert.assertEquals(false, check);
    }

}
