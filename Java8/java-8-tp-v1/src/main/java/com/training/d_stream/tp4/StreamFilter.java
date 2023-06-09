package com.training.d_stream.tp4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercice :
 *
 * En passant par l’API Stream et la méthode filter, lister tous les
 * fichiers « .java » dans le répertoire parent et les sous-répertoires
 */
public class StreamFilter {

	public static void main(final String[] args) throws IOException {
		final Path parent = Paths.get(".."); // répertoire parent
		final Stream<Path> list = Files.walk(parent);

		List<Path> list2 = list.filter(file -> file.toString().contains(".java")).collect(Collectors.toList());

		list2.forEach(System.out::println);
	}

}