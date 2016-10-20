package es.upm.miw.pd.calculator.memento.solution;

import es.upm.miw.pd.command.calculator.solution.Calculator;
import es.upm.miw.pd.command.calculator.solution.Comando;

public abstract class SuperComando implements Comando {

    protected Calculator calculator;

    public SuperComando(Calculator calculator) {
        super();
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
