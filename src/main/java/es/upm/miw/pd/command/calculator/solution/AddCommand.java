package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class AddCommand implements Comando {
    private Calculator receptor;

    public AddCommand(Calculator receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "Add integer";
    }

    @Override
    public void execute() {
        this.receptor.add(IO.getIO().readInt("Introduce valor: "));
    }

}
