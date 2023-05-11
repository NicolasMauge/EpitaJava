package com.training.d_stream.tp1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Exercice :
 *
 * - Remplacer dans la méthode collect: Les expressions lambda Par des
 * références de méthode.
 */
public class StreamCollect1 {

	public static void main(final String[] args) {
		final String[] strings = { "a", "b", "c", "d", "e" };
		final Stream<String> stream1 = Stream.of(strings);
		//final StringBuilder sb1 = stream1.collect(() -> new StringBuilder(), (a,b)->a.append(b), (a,b)->a.append(b));
		final StringBuilder sb1 = stream1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

		System.out.println(sb1.toString());

		System.out.println("---------------");
	}
}