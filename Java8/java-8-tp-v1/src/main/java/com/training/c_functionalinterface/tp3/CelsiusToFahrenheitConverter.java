package com.training.c_functionalinterface.tp3;

import java.util.function.IntToDoubleFunction;

public class CelsiusToFahrenheitConverter {

	public static void main(final String[] args) {
		int celsius = 18;

		IntToDoubleFunction convertCelsius = (int degreCelsius) -> { return 1.8*degreCelsius + 32; };

		System.out.println(convertCelsius.applyAsDouble(celsius));
	}

}