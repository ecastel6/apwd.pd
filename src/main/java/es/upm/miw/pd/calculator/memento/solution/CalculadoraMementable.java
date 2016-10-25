package es.upm.miw.pd.calculator.memento.solution;

import es.upm.miw.pd.command.calculator.solution.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable<Memento> {

    @Override
    public Memento createMemento() {
        return new Memento(super.getTotal());
    }

    @Override
    public void restoreMemento(Memento memento) {
        super.setTotal(memento.getValue());
    }

}
