package es.upm.miw.pd.calculator.memento.solution;

import upm.jbb.IO;

public class RestoreCommand extends MementoComando {

	private CalculadoraMementable receptor;
	
	public RestoreCommand(CalculadoraMementable calculator, GestorMementos<Memento> gestorMementos) {
		super(calculator, gestorMementos);
		this.receptor=calculator;
	}

	@Override
	public String name() {
		return "Restore memento";
	}

	@Override
	public void execute() {
		Memento memento = (Memento) IO.getIO().select(super.getGestorMementos().keys());
		receptor.restoreMemento(memento);
	}
}