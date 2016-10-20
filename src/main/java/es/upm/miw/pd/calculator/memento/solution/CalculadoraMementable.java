package es.upm.miw.pd.calculator.memento.solution;

import es.upm.miw.pd.command.calculator.solution.Calculator;
import upm.jbb.IO;

public class CalculadoraMementable extends Calculator implements Mementable<Memento> {
        
	private Calculator calculator;
	public CalculadoraMementable (Calculator calculator){
		super();
		this.calculator=calculator;
		
	}
	
	@Override
	public Memento createMemento(String name) {
		return new Memento(super.getTotal(), name);
	}

	@Override
	public void restoreMemento(Memento memento) {
		super.setTotal(memento.getValor());
	}

}
