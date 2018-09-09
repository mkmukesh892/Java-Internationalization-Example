package com.mukesh.i18n.locale;

import java.util.ListResourceBundle;

public class MyClassBundle_da extends ListResourceBundle {

	private Object[][] contents= {
			{"price",new Double(75.00)},
			{"currency","DKK"}
	};
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

}
