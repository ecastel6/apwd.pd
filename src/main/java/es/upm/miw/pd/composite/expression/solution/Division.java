package es.upm.miw.pd.composite.expression.solution;

public class Division {
	private int operadorIzq;
	private int operadorDer;

	public Division(int left, int right) {
		this.operadorIzq = left;
		this.operadorDer = right;
	}

	public int operar() {
		return (this.operadorIzq / this.operadorDer);
	}
}
