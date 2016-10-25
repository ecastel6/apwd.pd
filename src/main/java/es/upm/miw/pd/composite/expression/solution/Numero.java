package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {

    private int number;

    public Numero(int number) {
        this.number = number;
    }

    @Override
    public int operar() {
        return this.number;
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }

}
