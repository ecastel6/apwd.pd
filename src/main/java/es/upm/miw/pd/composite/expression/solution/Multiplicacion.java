package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends CompositeOperacion {

    public Multiplicacion(Expresion leftExpresion, Expresion rightExpresion) {
        super(leftExpresion, rightExpresion);
    }

    @Override
    public int operar() {
        return leftOperand.operar() * rightOperand.operar();
    }

    public char operador() {
        return '*';
    }
}
