package com.lynda.javatraining;

import java.text.NumberFormat;

public class NumericLiteralDemo {

	public static void main(String[] args) {
		int NumberOfOlives = 1_000_000;
		NumberFormat formater = NumberFormat.getInstance();
		System.out.println(formater.format(NumberOfOlives));

	}

}
