package org.lya.sesion02;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposSubsecuencia {

	public static double mediaArray(long[] tiempo) {
		Arrays.sort(tiempo);
		int suma = 0;
		for (int i = 0; i < tiempo.length - 1; i++)
			suma += tiempo[i];
		return (double) suma / (double) (tiempo.length - 1);
	}

	public static void main(String[] args) {
		System.out.print("Dimensión de la matriz: ");
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		Subsecuencia array = new Subsecuencia(n);
		long[] tiemposFuerzaBruta = new long[10];
		long[] tiemposMejorado = new long[10];
		long[] tiemposLineal = new long[10];
		long startTime, endTime;

		for (int i = 0; i < 10; i++) {
			startTime = System.nanoTime();
			array.SubsecuenciaFuerzaBruta();
			endTime = System.nanoTime();
			tiemposFuerzaBruta[i] = endTime - startTime;

			startTime = System.nanoTime();
			array.SubsecuenciaMejorado();
			endTime = System.nanoTime();
			tiemposMejorado[i] = endTime - startTime;

			startTime = System.nanoTime();
			array.SubsecuenciaLineal();
			endTime = System.nanoTime();
			tiemposLineal[i] = endTime - startTime;
		}

		System.out.printf(
				"Dimension de la matriz, n = %d\nTiempo Medio Fuerza Bruta = %.4f nanosegundos\nTiempo Medio Mejorado = %.4f nanosegundos\nTiempo Medio Lineal = %.4f nanosegundos",
				n, mediaArray(tiemposFuerzaBruta), mediaArray(tiemposMejorado), mediaArray(tiemposLineal));
	}
}
