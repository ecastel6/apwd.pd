package es.upm.miw.pd.calculator.memento.solution;

import upm.jbb.IO;

public class RestoreCommand extends MementoComando {

    public RestoreCommand(CalculadoraMementable calculatorMementable, GestorMementos<Memento> gestorMementos) {
        super(calculatorMementable, gestorMementos);
    }

    @Override
    public String name() {
        return "Restore memento";
    }

    @Override
    public void execute() {
        String nameMemento = (String) IO.getIO().select(super.getGestorMementos().keys());
        Memento memento = getGestorMementos().getMemento(nameMemento);
        ((CalculadoraMementable) getCalculator()).restoreMemento(memento);
    }
}
