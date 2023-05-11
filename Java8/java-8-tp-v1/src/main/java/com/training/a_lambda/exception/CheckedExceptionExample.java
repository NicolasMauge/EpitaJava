package com.training.a_lambda.exception;

import java.util.Arrays;
import java.util.List;

public class CheckedExceptionExample {

	public static void main(final String[] args) {

		final List<String> classes = Arrays.asList("java.lang.Object", "java.lang.Integer", "java.lang.String");

		classes.forEach(className -> {
			final Class<?> clazz;
			try {
				clazz = Class.forName(className);
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
			System.out.println(clazz);
		});

	}

}
