package com.mukesh.i18n.simpledateformat;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {

	public static void main(String[] args) throws ParseException {
		//formatting dates
		String pattern="MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
		String date=simpleDateFormat.format(new Date());
		System.out.println("formatted date : "+date);
		//parsing date
		String pattern1="yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat(pattern1);
		Date date2=simpleDateFormat2.parse("1992-04-17");
		System.out.println("Parsed date : "+date2);
		//creating a SimpledateFormat for a specific locale
		String pattern2 = "G EEEEE MMMMM yyyy FF ww HH:mm:ss.SSSZ z a";
		SimpleDateFormat simpleDateFormat3=new SimpleDateFormat(pattern2,new Locale("en","US"));
		String date3=simpleDateFormat3.format(new Date());
		System.out.println("Specific locale : "+date3);
		/*Pattern Syntax
		You can use the following symbols in your formatting pattern:

		G	Era designator (before christ, after christ)
		y	Year (e.g. 12 or 2012). Use either yy or yyyy.
		M	Month in year. Number of M's determine length of format (e.g. MM, MMM or MMMMM)
		d	Day in month. Number of d's determine length of format (e.g. d or dd)
		h	Hour of day, 1-12 (AM / PM) (normally hh)
		H	Hour of day, 0-23 (normally HH)
		m	Minute in hour, 0-59 (normally mm)
		s	Second in minute, 0-59 (normally ss)
		S	Millisecond in second, 0-999 (normally SSS)
		E	Day in week (e.g Monday, Tuesday etc.)
		D	Day in year (1-366)
		F	Day of week in month (e.g. 1st Thursday of December)
		w	Week in year (1-53)
		W	Week in month (0-5)
		a	AM / PM marker
		k	Hour in day (1-24, unlike HH's 0-23)
		K	Hour in day, AM / PM (0-11)
		z	Time Zone
		'	Escape for text delimiter
		'	Single quote
*/	
	//DateFormatSymbols
		Locale locale=new Locale("en","UK");
		DateFormatSymbols dateFormatSymbols=new DateFormatSymbols(locale);
		dateFormatSymbols.setWeekdays(new String[] {
				"Unused",
				"Sad Sunday",
				"Manic Monday",
		        "Thriving Tuesday",
		        "Wet Wednesday",
		        "Total Thursday",
		        "Fat Friday",
		        "Super Saturday"
		});
		dateFormatSymbols.setAmPmStrings(new String[] {
				"hello(AM)","hi(PM)"
		});
		String pattern4="EEEEE MMMMM yyyy a";
		SimpleDateFormat simpleDateFormat4=new SimpleDateFormat(pattern4,dateFormatSymbols);
		String date4=simpleDateFormat4.format(new Date());
		System.out.println("Date format symbols : "+date4);
		/*dateFormatSymbols.setWeekdays();
		dateFormatSymbols.setAmPmStrings();
		dateFormatSymbols.setEras();
		dateFormatSymbols.setLocalPatternChars();
		dateFormatSymbols.setMonths();
		dateFormatSymbols.setShortMonths();
		dateFormatSymbols.setShortWeekdays();
		dateFormatSymbols.setZoneStrings();*/
	}

}
