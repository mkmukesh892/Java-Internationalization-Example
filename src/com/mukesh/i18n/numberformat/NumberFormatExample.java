package com.mukesh.i18n.numberformat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatExample {

	public static void main(String[] args) {
		//Locale locale=new Locale("da", "DK");
		Locale locale=new Locale("en", "US");
		//number format
		NumberFormat numberFormat=NumberFormat.getInstance(locale);
		numberFormat.setMaximumFractionDigits(4);
		numberFormat.setMinimumFractionDigits(2);
		String number=numberFormat.format(100.01888);
		System.out.println("Format of number : "+number);
		//currency format
		NumberFormat currencyFormat=NumberFormat.getCurrencyInstance(locale);
		String currency=currencyFormat.format(100.99);
		System.out.println("format of currency : "+currency);
		//currency object
		Currency currency2=currencyFormat.getCurrency();
		System.out.println("currency code : "+currency2.getCurrencyCode());
		
		//number percentage
		NumberFormat percentageFormat=NumberFormat.getPercentInstance(locale);
		String percentage=percentageFormat.format(99.999);
		
		System.out.println("percentage of number : "+percentage);

	}

}
