package com.training.d_stream.tp6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Exercice :
 *
 * - Trouver les personnes qui ont un nom Jeff
 *
 * - Trouver l'âge maximal des personnes
 *
 * - Convertir la liste de personnes en une Map avec comme clé l'âge et la
 * valeur le nom de la personne : List<Person> vers Map<Integer, String>
 *
 * - Afficher tous les éléments de la Map en passant par les API java 8.
 */
public class PersonStream {

	public static void main(final String[] args) {
		final List<Person> persons = Arrays.asList(new Person("Brian", 22), new Person("Jeff", 20), new Person("Jimmy", 40));

		List<Person> personList = persons.stream().filter(p->p.getName().contains("Jeff")).collect(Collectors.toList());

		System.out.println(personList);

		Integer ageMax = persons.stream().mapToInt(p->p.getAge()).max().getAsInt();

		System.out.println(ageMax);

		Map<Integer, String> dict = persons.stream().collect(Collectors.toMap());
	}

}