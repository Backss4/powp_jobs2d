package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommandBuilder;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	public enum Test {
		FIGURE_JOE_1, FIGURE_JOE_2, RECTANGLE, TRIANGLE
	}


	private final DriverManager driverManager;
	private final Test test;

	public SelectTestFigureOptionListener(DriverManager driverManager, Test test) {
		this.driverManager = driverManager;
		this.test = test;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(test) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				ComplexCommandBuilder.getRectangle().execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE:
				ComplexCommandBuilder.getTriangle().execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
