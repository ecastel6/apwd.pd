package es.upm.miw.pd.composite.expression.solution;

public class Resta extends CompositeOperacion {

    public Resta(Expresion leftExpresion, Expresion rightExpresion) {
        super(leftExpresion, rightExpresion);
    }

    @Override
    public int operar() {
        return leftOperand.operar() - rightOperand.operar();
    }

    @Override
    public char operador() {
        return '-';
    }
}
