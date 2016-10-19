package es.upm.miw.pd.text.solution;

public abstract class Componente {
    
    public abstract void add (Componente h);

    public abstract void remove (Componente h);

    public abstract String dibujar(boolean capitalize);
    
    public abstract boolean isComposite();
    
}
