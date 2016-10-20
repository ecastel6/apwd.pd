package es.upm.miw.pd.calculator.memento.solution;

import es.upm.miw.pd.command.calculator.solution.AddCommand;
import es.upm.miw.pd.command.calculator.solution.CommandManager;
import es.upm.miw.pd.command.calculator.solution.PrintCommand;
import es.upm.miw.pd.command.calculator.solution.ResetCommand;
import es.upm.miw.pd.command.calculator.solution.SubtractCommand;
import upm.jbb.IO;

public final class MainCalculadoraMemento {
    private GestorMementos<Memento> gm;

    private CommandManager commandManager;

    private CalculadoraMementable calculator;

    private MainCalculadoraMemento() {
        this.calculator = new CalculadoraMementable();
        this.gm = new GestorMementos<Memento>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator, gm));
        this.commandManager.add(new RestoreCommand(calculator, gm));

    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculadoraMemento());
    }

}
