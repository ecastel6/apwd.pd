package es.upm.miw.pd.text.solution;

public class Texto extends Composite {

    @Override
    public void add(Componente component) {
        if (!component.isComposite()) {
            throw new UnsupportedOperationException();
        } else {
            this.getTextComponents().add(component);
        }
    }

    @Override
    public void remove(Componente component) {
        if (!component.isComposite()) {
            throw new UnsupportedOperationException();
        } else {
            this.getTextComponents().remove(component);
        }
    }

    @Override
    public String printEOL() {
        return "---o---\n";
    }

}
