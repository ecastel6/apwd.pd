package es.upm.miw.pd.calculator.memento.solution;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
