package es.upm.miw.pd.calculator.memento.solution;

import upm.jbb.IO;

public class SaveCommand extends MementoComando {

	private CalculadoraMementable receptor;
	
	public SaveCommand(CalculadoraMementable calculator, GestorMementos<Memento> gestorMementos) {
		super(calculator, gestorMementos);
		this.receptor=calculator;
	}

	@Override
	public String name() {
		return "Save memento";
	}

	@Override
	public void execute() {
		String nameMemento=IO.getIO().readString("Memento name: ");
		receptor.createMemento(nameMemento);
	}
}