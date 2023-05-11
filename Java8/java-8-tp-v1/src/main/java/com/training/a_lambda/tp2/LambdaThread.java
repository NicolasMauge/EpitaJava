
package com.training.a_lambda.tp2;

/**
 * Exercice : Remplacer la classe anonyme par une expression lambda
 */
public class LambdaThread {

	public static void main(final String[] args) {

		// Old way
		final Thread oldThread = new Thread() {
			@Override
			public void run() {
				System.out.println("Old Thread way");
			}
		};
		oldThread.start();

		final Thread thread = new Thread(() -> System.out.println("New way"));
		thread.start();
	}
}
