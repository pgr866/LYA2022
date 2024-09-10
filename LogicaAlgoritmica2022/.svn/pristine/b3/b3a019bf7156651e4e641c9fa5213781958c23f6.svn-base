package org.lya.tema3;

import java.math.BigInteger;
	
public class Factorial {
	
	public static long factorialIterativo(int n){
		if (n == 0) 
			return 1;
		long fact = 1;
		for(int i=1; i<=n; i++){
			fact = fact * i;
		}
		return fact;
	}
		
	public static BigInteger factorialBigInt(int n) {
		BigInteger resultado = BigInteger.ONE;	
		for (int i = 1; i <= n; i++)
			resultado = resultado.multiply(new BigInteger(i + ""));
		return resultado;
	}
	
	public static int factorialRecursivo(int n){
		if (n == 0)
			return 1;
		else
			return n * factorialRecursivo(n - 1);
	}

	public static void main(String[] args) {			
		int N= 10;
		
		long startTime = System.nanoTime();
		long fac = factorialIterativo(N);
		long endTime = System.nanoTime();  
		System.out.println("F.  Iterativo de " +N +"= " + fac  +" calculado en " + (endTime-startTime) +" nanosegundos");
		
		startTime = System.nanoTime();
		fac = factorialRecursivo(N);
		endTime = System.nanoTime();  
		System.out.println("F.  Recursivo de " +N +"= " + fac  +" calculado en " + (endTime-startTime) +" nanosegundos");
		
		startTime = System.nanoTime();
		BigInteger facB = factorialBigInt(N);
		endTime = System.nanoTime();  
		System.out.println("F. BigInteger de " +N +"= " + facB +" calculado en " + (endTime-startTime) +" nanosegundos");	
	}
}
