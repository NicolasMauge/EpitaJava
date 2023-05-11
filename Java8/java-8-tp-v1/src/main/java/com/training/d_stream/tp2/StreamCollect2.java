package com.training.d_stream.tp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercice :
 *
 * - Remplacer dans la méthode collect: Les références de méthode par des
 * expressions lambda.
 */
public class StreamCollect2 {
	public static void main(final String[] args) {
		final String[] strings = { "a", "b", "c", "d" };
		final Stream<String> stream2 = Stream.of(strings);
		//final List<String> list2 = stream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		final List<String> list2 = stream2.collect(()->new ArrayList<>(), (a,b) -> a.add(b), (a,b) -> a.addAll(b));

		list2.forEach(System.out::print);
		System.out.println("------------------");
		Arrays.stream(strings).forEach(System.out::print);

		System.out.println("------------------");
		final Stream<String> stream3 = Stream.of(strings);
		final List<String> list3 = stream3.collect(Collectors.toList());

		list3.forEach(System.out::print);
	}
}