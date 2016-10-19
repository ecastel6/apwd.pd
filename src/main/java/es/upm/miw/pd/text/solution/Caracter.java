package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {
    private char character;

    public Caracter (char character) {
        this.character=character;
    }
    
    @Override
    public void add(Componente h) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Componente h) {
        // TODO Auto-generated method stub

    }

    @Override
    public String dibujar(boolean capitalize) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isComposite() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public char getCharacter() {
        return character;
    }
    
    public void setCharacter(char character) {
        this.character = character;
    }

}
