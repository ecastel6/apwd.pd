package es.upm.miw.pd.text.solution;

public abstract class Componente {
    public Componente() {
        
    }
    public abstract void add (Componente h);

    public abstract void dibujar(boolean b);
    
    public abstract boolean isComposite();
    
}
