package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Componente {

    private List<Componente> textComponents;

    public Composite() {
        this.textComponents = new ArrayList<Componente>();

    }

    public List<Componente> getTextComponents() {
        return this.textComponents;
    }

    @Override
    public void add(Componente component) {

    }

    @Override
    public void remove(Componente component) {

    }

    @Override
    public String dibujar(boolean b) {
        return null;

    }

    public abstract String printEOL();

    @Override
    public boolean isComposite() {
        return true;
    }

}
