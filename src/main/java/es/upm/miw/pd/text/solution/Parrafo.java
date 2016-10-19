package es.upm.miw.pd.text.solution;

public class Parrafo extends Composite {

    @Override
    public void add(Componente component) {
        if (component.isComposite()) {
            throw new UnsupportedOperationException("No se puede añadir un párrafo a otro");
        } 
        else
        {
            this.getTextComponents().add(component);
        }
    }

    @Override
    public void remove(Componente component) {
        if (!component.isComposite()) {
            this.getTextComponents().remove(component);
        }
    }

    @Override
    public String dibujar(boolean capitalize) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String printEOL() {
        // TODO Auto-generated method stub
        return null;
    }

}
