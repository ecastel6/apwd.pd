package es.upm.miw.pd.calculator.memento.solution;

import upm.jbb.IO;

public class SaveCommand extends MementoComando {

    public SaveCommand(CalculadoraMementable calculatorMementable, GestorMementos<Memento> gestorMementos) {
        super(calculatorMementable, gestorMementos);
    }

    @Override
    public String name() {
        return "Save memento";
    }

    @Override
    public void execute() {
        Memento memento = ((CalculadoraMementable) getCalculator()).createMemento();
        String nameMemento = IO.getIO().readString("Memento name: ");
        getGestorMementos().addMemento(nameMemento, memento);
    }
}
