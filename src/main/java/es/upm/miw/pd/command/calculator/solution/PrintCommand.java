package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class PrintCommand implements Comando {
    private Calculator receptor;

    public PrintCommand(Calculator receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "Print result";
    }

    @Override
    public void execute() {
        IO.getIO().println(this.receptor.getTotal());
    }

}
