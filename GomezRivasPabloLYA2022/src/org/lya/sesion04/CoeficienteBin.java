package org.lya.sesion04;

public class CoeficienteBin {

	private int cbN;
	private int cbK;

	public CoeficienteBin(int n, int k) throws IllegalArgumentException {
		if (!(k <= n))
			throw new IllegalArgumentException("N no puede ser menor que K");

		cbN = n;
		cbK = k;
	}

	public int getN() {
		return this.cbN;
	}

	public int getK() {
		return this.cbK;
	}

	public void setN(int n) {
		this.cbN = n;
	}

	public void setK(int k) {
		this.cbK = k;
	}

	public double coefBinomialRecursivo() {
		if (this.cbK > this.cbN || this.cbK < 0)
			return 0;

		return coefBinomialRecursivo(this.cbN, this.cbK);
	}

	private static long coefBinomialRecursivo(int n, int k) {
		if (k == 0 || k == n)
			return 1;

		if (n == 0)
			return 0;

		return coefBinomialRecursivo(n - 1, k - 1) + coefBinomialRecursivo(n - 1, k);
	}

	public long coefBinomialProgDinam() {
		int n, k;
		int[][] matriz = new int[cbN + 1][cbK + 1];

		for (n = 0; n <= cbN; n++)
			matriz[n][0] = 1;

		for (k = 1; k <= cbK; k++)
			matriz[0][k] = 0;

		for (n = 1; n <= cbN; n++) {
			for (k = 1; k <= cbK; k++)
				matriz[n][k] = matriz[n - 1][k - 1] + matriz[n - 1][k];
		}

		return matriz[cbN][cbK];
	}
}
