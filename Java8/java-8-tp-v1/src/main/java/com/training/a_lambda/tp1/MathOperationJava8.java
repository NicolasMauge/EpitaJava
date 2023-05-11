package com.training.a_lambda.tp1;

public class MathOperationJava8 {

	public static void main(final String[] args) {
		MathOperation mathOperation = (int a, int b) -> a+b;

		final int d = mathOperation.calculer(1, 3);
		System.out.println(d);
	}

}
