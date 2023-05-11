package com.training.c_functionalinterface.tp1;

import java.util.function.Function;

public class MilesToKmConverter {

	public static void main(final String[] args) {
		final int miles = 3;
		double kms = 0;

		// Avant JAVA 8
		final Converter converter = new Converter();
		kms = converter.apply(miles);

		// Depuis JAVA 8
		Function<Integer, Double> converter2 = (Integer milesI) -> { return 1.6*milesI;};

		System.out.printf("%d miles = %3.2f kilometers", miles, converter2.apply(miles));
	}

}