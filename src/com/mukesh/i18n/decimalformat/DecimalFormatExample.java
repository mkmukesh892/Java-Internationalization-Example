package com.mukesh.i18n.decimalformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatExample {

	public static void main(String[] args) {
		//decimalformat for default locale of JVM
		String pattern="###,###.###";
		DecimalFormat decimalFormat=new DecimalFormat(pattern);
		String format=decimalFormat.format(124567891.123);
		System.out.println(format);
		//decimalformat for a specific locale
		Locale locale=new Locale("en","UK");
		String pattern1="###.##";
		DecimalFormat decimalFormat2=(DecimalFormat)NumberFormat.getNumberInstance(locale);
		decimalFormat2.applyPattern(pattern1);
		String format1=decimalFormat2.format(123456789.1234);
		System.out.println(format1);
		//DecimalFormatSymbols
		DecimalFormatSymbols symbols=new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator(';');
		symbols.setGroupingSeparator(':');
		String pattern2="#,##0.###";
		DecimalFormat decimalFormat3=new DecimalFormat(pattern2,symbols);
		String number=decimalFormat3.format(123456789.123);
		System.out.println(number);
	}

}
