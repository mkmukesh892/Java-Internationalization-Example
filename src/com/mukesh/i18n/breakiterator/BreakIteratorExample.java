package com.mukesh.i18n.breakiterator;

import java.text.BreakIterator;
import java.util.Locale;

public class BreakIteratorExample {

	public static void main(String[] args) {
		Locale locale =Locale.UK;
		//character Boundaries
		BreakIterator breakIterator=BreakIterator.getCharacterInstance(locale);
		breakIterator.setText("Mary had a little Android device.");
		int boundaryIndex=breakIterator.first();
		System.out.println("Character boundaries are : ");
		while(boundaryIndex!=BreakIterator.DONE) {
			System.out.println(boundaryIndex);
			boundaryIndex=breakIterator.next();
		}
		//word Boundaries
		BreakIterator breakIterator1=BreakIterator.getWordInstance(locale);
		breakIterator1.setText("Mary had a little Android device.");
		int boundaryIndex1=breakIterator1.first();
		System.out.println("Word boundaries are : ");
		while(boundaryIndex1!=BreakIterator.DONE) {
			System.out.println(boundaryIndex1);
			boundaryIndex1=breakIterator1.next();
		}
	}

}
