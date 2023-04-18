package com.training.functionalinterface.tp2;

import java.util.function.BiFunction;

public class CalculSurface {

	public static void main(final String[] args) {
		Double largeur = 1.5;
		Double longueur = 2.0;

		BiFunction<Double, Double, Double> surfCalc = (Double L, Double I) -> { return L*I;};

		System.out.println("Surface de "+largeur+ "x"+longueur+" = "+surfCalc.apply(largeur, longueur));

	}

}