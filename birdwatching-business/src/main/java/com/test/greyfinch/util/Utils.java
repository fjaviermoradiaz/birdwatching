package com.test.greyfinch.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Utils {

    public static Integer getMonthFromDate(Date paramDate) {
        LocalDate localDate = paramDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getMonthValue();
    }
}
