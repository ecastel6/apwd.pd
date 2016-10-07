package es.upm.miw.pd.composite.expression.solution;

public class Resta {
	private int operadorIzq;
	private int operadorDer;
	public Resta (int left, int right){
		this.operadorIzq=left;
		this.operadorDer=right;
	}
	public int operar (){
		return (this.operadorIzq-this.operadorDer);
	}
}
