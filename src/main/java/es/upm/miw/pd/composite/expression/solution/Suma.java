package es.upm.miw.pd.composite.expression.solution;

public class Suma extends CompositeOperacion {

    public Suma(Expresion leftExpresion, Expresion rightExpresion) {
        super(leftExpresion, rightExpresion);

    }

    @Override
    public int operar() {
        return leftOperand.operar() + rightOperand.operar();
    }

    @Override
    public char operador() {
        return '+';
    }
}
