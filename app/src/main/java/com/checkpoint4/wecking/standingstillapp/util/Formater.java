package com.checkpoint4.wecking.standingstillapp.util;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wecking on 10/17/15.
 */
public class Formater {

    public static String formatDate(long longDate){
        Date date=new Date(longDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateText = dateFormat.format(date);

        return dateText;
    }
}
