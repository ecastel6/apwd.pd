package es.upm.miw.pd.calculator.memento.solution;

public interface Mementable<T> {
    T createMemento(String n);

    void restoreMemento(T memento);

}
