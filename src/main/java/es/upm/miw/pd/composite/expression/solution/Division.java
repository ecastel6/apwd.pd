package es.upm.miw.pd.composite.expression.solution;

public class Division extends CompositeOperacion {

    public Division(Expresion leftExpresion, Expresion rightExpresion) {
        super(leftExpresion, rightExpresion);
    }

    @Override
    public int operar() {
        return leftOperand.operar() / rightOperand.operar();
    }

    @Override
    public String toString() {
        return "(" + leftOperand.toString() + "/" + rightOperand.toString() + ")";
    }
}
