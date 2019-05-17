package kea.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandling
{
    // Convert Enrollmentdate into the right format for mysql (yyyy-MM-dd)
    public static String convertDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }





}
