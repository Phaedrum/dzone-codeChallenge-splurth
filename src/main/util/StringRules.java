package main.util;

public class StringRules {
	
	public static boolean isExactSize(String input, int size) {	
		return input.length() == size;
	}
	public static boolean isExactOrGreater(String input, int size){
		return input.length() >= size;
	}
	
	public static boolean isCharacterAtUpperCase(String input, int index){
		return Character.isUpperCase(input.charAt(index));
	}
	public static boolean isFirstCharUpperCase(String input){
		return isCharacterAtUpperCase(input, 0);
	}
	
	public static boolean isLowerCase(String input){
		return input.chars().allMatch(x -> Character.isLowerCase(x));
	}
	
	public static boolean isUpperCase(String input){
		return !isLowerCase(input);
	}
	
	public static boolean isLowerCaseAfterFirstChar(String input){
		return isLowerCase(input.substring(1));
	}
	
	public static boolean containsOnlyLetters(String input){
		return input.chars().allMatch(x -> Character.isLetter(x));
	}
	public static boolean isCharAfterChar(String input, char after, char before){
		int index = input.indexOf(before);
		return index > -1 && input.substring(index +1).indexOf(after) > -1;
	}
}
