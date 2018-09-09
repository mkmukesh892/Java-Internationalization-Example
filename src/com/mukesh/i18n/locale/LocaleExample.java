package com.mukesh.i18n.locale;

import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class LocaleExample {

	public static void main(String[] args) {
		Locale locale=new Locale("en","US");
		ResourceBundle labels=ResourceBundle.getBundle("com.mukesh.i18n.locale.MyClassBundle",locale);
		System.out.println("price   : "+labels.getObject("price"));
		System.out.println("currency: "+labels.getObject("currency"));
		locale = new Locale("da", "DK");
		ResourceBundle bundle = ResourceBundle.getBundle("com.mukesh.i18n.locale.MyClassBundle", locale);

		System.out.println("price   : " + bundle.getObject("price"));
		System.out.println("currency: " + bundle.getObject("currency"));
		Set<String> keys=bundle.keySet();
		Iterator<String> iterator=keys.iterator();
		while(iterator.hasNext()) {
			System.out.println("value : "+iterator.next());
		}
		System.out.println("locale : "+bundle.getLocale());
		//System.out.println("language : "+Double.valueOf(bundle.getString("price")));
	}

}
