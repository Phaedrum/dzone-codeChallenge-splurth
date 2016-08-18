package main.challenge;

import static main.util.StringRules.*;

public class SplurthElementValidator {
	public static final int LETTERS_IN_SYMBOL = 2;

	public boolean isValidElement(String name, String symbol) {
		return isValidName(name) && isValidSymbol(symbol) && isValidNameForSymbol(name, symbol);
	}

	private boolean isValidName(String name) {
		return isExactOrGreater(name, LETTERS_IN_SYMBOL) && containsOnlyLetters(name) && isFirstCharUpperCase(name)
				&& isLowerCaseAfterFirstChar(name);
	}

	private boolean isValidSymbol(String symbol) {
		return isExactSize(symbol, LETTERS_IN_SYMBOL) && containsOnlyLetters(symbol) && isFirstCharUpperCase(symbol)
				&& isLowerCaseAfterFirstChar(symbol);
	}

	private boolean isValidNameForSymbol(String name, String symbol) {
		String lowerCaseSymbol = symbol.toLowerCase();
		char first = lowerCaseSymbol.charAt(0);
		char second = lowerCaseSymbol.charAt(1);
		return isCharAfterChar(name.toLowerCase(), second, first);
	}
}
