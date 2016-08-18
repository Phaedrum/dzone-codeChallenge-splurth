package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.challenge.SplurthElementValidator;

public class SplurthElementValidatorTest {
	
	SplurthElementValidator validator = new SplurthElementValidator();

	@Test 
	public void isValidElementReturnsTrueWithValidSameCharacterSymbol() {
		assertTrue(validator.isValidElement("Spenglerium", "Ee"));
	}
	
	@Test 
	public void isValidElementReturnsFalseWithInvalidSameCharacterSymbol() {
		assertFalse(validator.isValidElement("Melintzum", "Nn"));
	}
	
	@Test 
	public void isValidElementReturnsTrueWithValidSymbolthatStartsWithFirstLetter() {
		assertTrue(validator.isValidElement("Zeddemorium", "Zr"));
	}
	
	@Test 
	public void isValidElementReturnsFalseWithInvalidSymbolthatStartsWithFirstLetter() {
		assertFalse(validator.isValidElement("Tullium", "Ty"));
	}
	
	@Test 
	public void isValidElementReturnsFalseIfSecondCharIfBeforeFirstInString() {
		assertFalse(validator.isValidElement("Stantzon", "Zt"));
	}
	
	@Test 
	public void isValidElementReturnsFalseIfSecondCharNotInString() {
		assertFalse(validator.isValidElement("Stantzon", "Zy"));
	}
	
	@Test 
	public void isValidElementReturnsFalseIfSymbolStartLowercase() {
		assertFalse(validator.isValidElement("Stantzon", "zY"));
	}
	
	@Test 
	public void isValidElementReturnsFalseIfNameStartLowercase() {
		assertFalse(validator.isValidElement("stantzon", "Zn"));
	}
	
	@Test 
	public void isValidElementReturnsFalseIfSymbolSizeIsDifferentFromTwo() {
		assertFalse(validator.isValidElement("stantzon", "Zno"));
	}
}