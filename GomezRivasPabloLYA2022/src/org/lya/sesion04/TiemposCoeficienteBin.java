package org.lya.sesion04;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposCoeficienteBin {

	public static double mediaArray(long[] tiempo) {
		Arrays.sort(tiempo);
		int suma = 0;
		for (int i = 0; i < tiempo.length - 1; i++)
			suma += tiempo[i];

		return (double) suma / (double) (tiempo.length - 1);
	}

	public static void main(String[] args) {
		System.out.print("Tamano del coeficiente: ");
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		CoeficienteBin coef = new CoeficienteBin(2 * n, n);
		long[] tiemposRecursivo = new long[10];
		long[] tiemposProgDinam = new long[10];
		long startTime;
		long endTime;

		for (int i = 0; i < 10; i++) {
			startTime = System.nanoTime();
			coef.coefBinomialRecursivo();
			endTime = System.nanoTime();
			tiemposRecursivo[i] = endTime - startTime;

			startTime = System.nanoTime();
			coef.coefBinomialProgDinam();
			endTime = System.nanoTime();
			tiemposProgDinam[i] = endTime - startTime;
		}

		System.out.printf(
				"Tiempo Medio Recursivo = %.4f nanosegundos\nTiempo Medio Programacion Dinamica = %.4f nanosegundos",
				mediaArray(tiemposRecursivo), mediaArray(tiemposProgDinam));

	}
}
