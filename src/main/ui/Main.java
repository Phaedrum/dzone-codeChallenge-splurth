package main.ui;

import main.challenge.SplurthElementValidator;

public class Main {

	public static void main(String[] args) {
		SplurthElementValidator en = new SplurthElementValidator();
		System.out.println(en.isValidElement("Spenglerium", "Ee")); //true
		System.out.println(en.isValidElement("Zeddemorium", "Zr")); //true
		System.out.println(en.isValidElement("Venkmine", "Kn")); //true
		System.out.println(en.isValidElement("Stantzon", "Zt")); //false
		System.out.println(en.isValidElement("Melintzum", "Nn")); //false
		System.out.println(en.isValidElement("Tullium", "Ty")); //false
	}
}
