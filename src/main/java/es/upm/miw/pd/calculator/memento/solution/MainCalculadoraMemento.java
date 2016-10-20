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
	
    private MainCalculadoraMemento() {
        this.gm = new GestorMementos<Memento>();
        this.o = new CalculadoraMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        
        IO.getIO().addView(this.o);
        IO.getIO().addView(this);
    }

    public void createMemento() {
        this.gm.addMemento(IO.getIO().readString("Nombre del Memento"), o.createMemento());
    }

    public void restoreMemento() {
        this.o.restoreMemento(this.gm.getMemento((String) IO.getIO().select(gm.keys(), "Restaurar")));
    }

    public static void main(String[] args) {
        new MainCalculadoraMemento();
    }

}
