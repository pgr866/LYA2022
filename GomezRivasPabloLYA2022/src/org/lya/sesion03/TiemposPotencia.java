package org.lya.sesion03;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposPotencia {

	public static double mediaArray(long[] tiempo) {
		Arrays.sort(tiempo);
		int suma = 0;
		for (int i = 0; i < tiempo.length - 1; i++)
			suma += tiempo[i];

		return (double) suma / (double) (tiempo.length - 1);
	}

	public static void main(String[] args) {
		int a = 2;
		System.out.println("Base Fijada a " + a);
		System.out.print("Exponente: ");
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();

		Potencia potencia = new Potencia(a, n);
		long[] tiemposFuerzaBruta = new long[10];
		long[] tiemposRecursivo = new long[10];
		long startTime, endTime;

		for (int i = 0; i < 10; i++) {
			startTime = System.nanoTime();
			potencia.exponenFuerzaBruta();
			endTime = System.nanoTime();
			tiemposFuerzaBruta[i] = endTime - startTime;

			startTime = System.nanoTime();
			potencia.exponenRecursivoDyV();
			endTime = System.nanoTime();
			tiemposRecursivo[i] = endTime - startTime;
		}

		System.out.printf("Tiempo Medio Fuerza Bruta = %.4f nanosegundos\nTiempo Medio Recursivo = %.4f nanosegundos",
				mediaArray(tiemposFuerzaBruta), mediaArray(tiemposRecursivo));

	}
}
