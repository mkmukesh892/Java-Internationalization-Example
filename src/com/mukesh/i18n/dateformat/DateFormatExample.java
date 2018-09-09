package com.mukesh.i18n.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {

	public static void main(String[] args) {
		
		Locale locale=new Locale("en", "UK");
		/*
		//DateFormat constant
		DateFormat.DEFAULT
		DateFormat.SHORT
		DateFormat.MEDIUM
		DateFormat.LONG
		DateFormat.FULL*/
		//formatting date
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		String date=dateFormat.format(new Date());
		System.out.println("date format : "+date);
		//formatting time
		DateFormat dateFormat2=DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		String date1=dateFormat2.format(new Date());
		System.out.println("Time format : "+date1);
		//formatting date and time simultaneously
		DateFormat dateFormat3=DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
		String date2=dateFormat3.format(new Date());
		System.out.println("date and time format : "+date2);
	}

}
