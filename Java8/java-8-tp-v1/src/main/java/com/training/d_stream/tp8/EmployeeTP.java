package com.training.d_stream.tp8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Exercice :
 *
 * - Afficher la liste des employées triées par numéro d’employée par ordre.
 * descendant
 *
 * - Afficher la liste des employées triées par nom puis par prénom.
 */
public class EmployeeTP {

	static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988, Month.APRIL, 12)));
		employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011, Month.DECEMBER, 15)));
		employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
		employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
		employees.add(new Employee(435, "Ann", "zee", LocalDate.of(1988, Month.APRIL, 17)));
		employees.add(new Employee(678, "Ann", "Stal", LocalDate.of(2007, Month.APRIL, 12)));
	}

	public static void main(final String[] args) {
		// TODO
	}

}
