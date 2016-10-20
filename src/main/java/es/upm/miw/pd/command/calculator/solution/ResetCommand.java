package es.upm.miw.pd.command.calculator.solution;

public class ResetCommand implements Comando {
    private Calculator receptor;

    public ResetCommand(Calculator receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "Reset total";
    }

    @Override
    public void execute() {
        this.receptor.reset();
    }

}
