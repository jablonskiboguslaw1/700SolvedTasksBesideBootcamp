package pl.codegym.task.task14.task1413;

import java.awt.event.MouseListener;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;

    private Monitor monitor;


    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
