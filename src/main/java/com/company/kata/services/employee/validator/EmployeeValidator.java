package com.company.kata.services.employee.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidator {

    public String validateEmail(String email){

        Pattern pattern = Pattern
                .compile("[a-z]{1,}\\.[a-z]{1,}\\@(?:gmail|foobar|hotmail|outlook)\\.(?:com|es)");

        Matcher mather = pattern.matcher(email);

        if (mather.find()) {
            return email;
        } else {
            return "El email ingresado es inválido.";
        }
    }

    public Boolean validateDate(String dateText) throws ParseException {

        LocalDate currentDate = LocalDate.now();

        Date dateOfBirthdayFormat = new SimpleDateFormat("yyyy/MM/dd").parse(dateText);
        Calendar birthday = Calendar.getInstance();
        birthday.setTime(dateOfBirthdayFormat);

        if ((currentDate.getMonthValue() == birthday.get(Calendar.MONTH)+1) && (currentDate.getDayOfMonth() == birthday.get((Calendar.DATE))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
