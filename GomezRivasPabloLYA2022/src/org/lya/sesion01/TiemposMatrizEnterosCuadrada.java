package org.lya.sesion01;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposMatrizEnterosCuadrada {

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

		MatrizEnterosCuadrada matriz = new MatrizEnterosCuadrada(n);
		long[] tiempos = new long[10];

		for (int i = 0; i < tiempos.length; i++) {
			long startTime = System.currentTimeMillis();
//			long startTime = System.nanoTime();
			matriz.matrizOrdenadaPorFilas();
			long endTime = System.currentTimeMillis();
//			long endTime = System.nanoTime();
			tiempos[i] = endTime - startTime;
		}

		double tiempoMedio = mediaArray(tiempos);
		System.out.printf("Matriz de dimensión n = %4d \t Tiempo medio = %12.4f milisegundos", n, tiempoMedio);
//		System.out.printf("Matriz de dimensión n = %4d \t Tiempo medio = %12.4f nanosegundos", n, tiempoMedio);
	}
}
