package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private final DrawPanelController drawController;
    public ILine line;
    private int startX = 0, startY = 0;


    public LineDrawerAdapter(DrawPanelController controller, ILine line) {
        this.drawController = controller;
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawController.drawLine(line);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return line.getClass().getSimpleName() + "Drawer";
    }
}
