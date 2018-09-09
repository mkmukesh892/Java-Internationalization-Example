package com.mukesh.i18n.charactermethods;

public class CharacterMethodExample {

	public static void main(String[] args) {
		char aChar = 'C';

		System.out.println(Character.isDigit (aChar));        // returns false
		System.out.println(Character.isLetter(aChar));        // returns true
		System.out.println(Character.isLetterOrDigit(aChar)); // returns true
		System.out.println(Character.isLowerCase(aChar));     // returns false
		System.out.println(Character.isUpperCase(aChar));     // returns true
		System.out.println(Character.isSpaceChar(aChar));     // returns false
		
		//getType() method
		int type=Character.getType(aChar);
		if(type==Character.LOWERCASE_LETTER) {
			System.out.println("This is lowercase letter");
		}
		if(type==Character.UPPERCASE_LETTER) {
			System.out.println("This is upercase letter");
		}
		if(type==Character.LETTER_NUMBER) {
			System.out.println("LETTER_NUMBER");
		}
		//isDefined()
		int anInt=aChar;
		boolean isDefined=Character.isDefined(anInt);
		System.out.println(anInt+" : "+isDefined);
	}

}
