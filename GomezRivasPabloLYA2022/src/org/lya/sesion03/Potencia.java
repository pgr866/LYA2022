package org.lya.sesion03;

public class Potencia {

	private int base;
	private int exponente;

	public Potencia() {
		base = 1;
		exponente = 0;
	}

	public Potencia(int a, int n) {
		if (!(a > 0))
			throw new IllegalArgumentException("Base debe ser mayor que 0");

		if (!(n >= 0))
			throw new IllegalArgumentException("Exponente no puede ser negativo");

		base = a;
		exponente = n;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}

	public double exponenFuerzaBruta() {
		double resultado = 1;
		for (int i = 0; i < exponente; i++)
			resultado *= base;

		return resultado;
	}

	public double exponenRecursivoDyV() {
		if (exponente == 0)
			return 1;

		return exponenRecursivoDyV(base, exponente);
	}

	private double exponenRecursivoDyV(int a, int n) {
//		Caso base
		if (n == 1)
			return a;
//		Recurrencia
		if (n % 2 == 0) {
			double valor = exponenRecursivoDyV(a, n / 2);
			return valor * valor;
		} else
			return (a * exponenRecursivoDyV(a, n - 1));
	}
}
