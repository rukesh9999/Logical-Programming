package com.logics.trickyjavaquestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = new Date();
		
		System.out.println(d);
		
        String formatteddate = sdf.format(d);
        System.out.println(formatteddate);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
        Date parse = sdf.parse(formatteddate);
        String format = sdf2.format(parse);
        
        System.out.println(format);
        
        
        Integer i = new Integer(null);
        
       // String s = new String(null);
        
        
		
	}
}
