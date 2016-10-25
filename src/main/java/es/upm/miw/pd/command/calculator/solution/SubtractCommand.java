package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class SubtractCommand implements Comando {
    private Calculator receptor;

    public SubtractCommand(Calculator receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "Subtract Integer";
    }

    @Override
    public void execute() {
        this.receptor.subtract(IO.getIO().readInt("Introduce valor: "));
    }

}
