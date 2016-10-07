package es.upm.miw.pd.composite.expression.solution;

public class Suma {
	private int operadorIzq;
	private int operadorDer;
	public Suma (int left, int right){
		this.operadorIzq=left;
		this.operadorDer=right;
	}
	public int operar (){
		return (this.operadorIzq+this.operadorDer);
	}
}
