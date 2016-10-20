package es.upm.miw.pd.calculator.memento.solution;

public abstract class MementoComando extends SuperComando {

	private GestorMementos<Memento> gestorMementos;
	
	public MementoComando(CalculadoraMementable calculator, GestorMementos<Memento>gestorMementos) {
		super(calculator);
		this.setGestorMementos(gestorMementos);
	}

	public GestorMementos<Memento> getGestorMementos() {
		return gestorMementos;
	}

	public void setGestorMementos(GestorMementos<Memento> gestorMementos) {
		this.gestorMementos = gestorMementos;
	}

}
