package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {
    private char character;

    public Caracter(char character) {
        this.character = character;
    }

    @Override
    public void add(Componente h) {
    }
    
    @Override
    public void remove(Componente component) {
    }
    
    @Override
    public String dibujar(boolean capitalize) {
        if (capitalize) {
            return Character.toString(this.character).toUpperCase();
        } else {
            return Character.toString(this.character);
        }
    }

    @Override
    public boolean isComposite() {
        return false;
    }

   

}
