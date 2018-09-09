package com.mukesh.i18n.collator;

import java.text.CollationKey;
import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Arrays;
import java.util.Locale;

public class CollatorExample {

	public static void main(String[] args) throws ParseException {
		Locale locale=Locale.UK;
		Collator collator=Collator.getInstance(locale);
		int result=collator.compare("Mukesh", "Orange");
		System.out.println("result : "+result);
		//customized Collation Rules
		String rules="< b < a";
		RuleBasedCollator ruleBasedCollator=new RuleBasedCollator(rules);
		int result1=ruleBasedCollator.compare("b", "a");
		System.out.println(result1);
		//grouping Characters
		String rules1="<c,C <b,B";
		RuleBasedCollator ruleBasedCollator1=new RuleBasedCollator(rules1);
		int result2=ruleBasedCollator1.compare("boss", "Carol");
		System.out.println(result2);
		//Combinations of characters interpreted as one character
		String rules2 = "< ch < b < a < c";

		RuleBasedCollator ruleBasedCollator2 =
		        new RuleBasedCollator(rules2);

		int result3 = ruleBasedCollator2.compare("boss", "carol");
		System.out.println(result3);

		result3 = ruleBasedCollator2.compare("boss", "charlie");
		System.out.println(result3);
		//Improved Performance Using CollationKey's
		String rules3 = "< c,C < b,B < a,A";

		RuleBasedCollator ruleBasedCollator3 =
		        new RuleBasedCollator(rules3);

		CollationKey[] collationKeys = new CollationKey[3];

		collationKeys[0] = ruleBasedCollator3.getCollationKey("boss");
		collationKeys[1] = ruleBasedCollator3.getCollationKey("carol");
		collationKeys[2] = ruleBasedCollator3.getCollationKey("andy");

		Arrays.sort(collationKeys);

		for(CollationKey collationKey : collationKeys) {
		    System.out.println(collationKey.getSourceString());
		}
	}

}
