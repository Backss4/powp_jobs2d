package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
	private final ArrayList<DriverCommand> commands = new ArrayList<>();

	public void addCommand(DriverCommand command) {
		this.commands.add(command);
	}

	public void removeCommand(DriverCommand command) {
		this.commands.remove(command);
	}

	public void execute(Job2dDriver driver) {
		for(DriverCommand command : commands) {
			command.execute(driver);
		}
	}
}
