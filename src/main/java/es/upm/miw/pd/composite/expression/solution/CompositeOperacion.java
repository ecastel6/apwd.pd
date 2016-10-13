package es.upm.miw.pd.composite.expression.solution;

public abstract class CompositeOperacion extends Expresion {

    public String operator;

    public Expresion leftOperand;

    public Expresion rightOperand;

    public CompositeOperacion(Expresion leftExpresion, Expresion rightExpresion) {
        this.leftOperand = leftExpresion;
        this.rightOperand = rightExpresion;
    }

    @Override
    public abstract int operar();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

}
