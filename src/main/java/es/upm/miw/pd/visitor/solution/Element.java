package es.upm.miw.pd.visitor.solution;

public interface Element {
    void accept(Visitor v);
}
