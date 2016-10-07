package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion {
	private int operadorIzq;
	private int operadorDer;
	public Multiplicacion (int left, int right){
		this.operadorIzq=left;
		this.operadorDer=right;
	}
	public int operar (){
		return (this.operadorIzq*this.operadorDer);
	}
}
