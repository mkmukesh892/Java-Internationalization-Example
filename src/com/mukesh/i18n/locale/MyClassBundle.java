package com.mukesh.i18n.locale;

import java.util.ListResourceBundle;

public class MyClassBundle extends ListResourceBundle {

	private Object[][] contents= {
			{"price",new Double(64.00)},
			{"currency","Dollar"}
	};
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

}
