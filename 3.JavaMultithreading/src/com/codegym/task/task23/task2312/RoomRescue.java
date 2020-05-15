/*
package com.codegym.task.task23.task2312;

import java.awt.event.KeyEvent;

public class RoomRescue {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static RoomRescue game;

    public RoomRescue(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

*/
/**
     * The program's main loop.
     * This is where all the important actions happen
     *//*


    public void run() throws InterruptedException {
        // Create a KeyboardObserver object and start it.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        // As long as the snake is alive
        while (snake.isAlive()) {
            // Does the observer have any key events?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                // If 'q', then exit the game.
                if (event.getKeyChar() == 'q') return;

                // If "left arrow", then move the figure to the left
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    // If "right arrow", then move the figure to the right
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    // If "up arrow", then move the figure up
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    // If "down arrow", then move the figure down
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   // Move the snake
            print();        // Display the current game state
            sleep();        // Pause between moves
        }

        System.out.println("Game Over!");
    }

    public void print() {
        int[][] field = new int[height][width];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {

                field[row][col] = 0;
                field[snake.getY()][snake.getX()] = 2;
                field[mouse.getY()][mouse.getX()] = 3;
                for (int i = 1; i < snake.getSections().size() ; i++) {
                    field[snake.getSections().get(i).getY()][snake.getSections().get(i).getX()] = 1;

                }
            }
        }
        for (int row = 0; row < field.length; row++) {

            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col]==3)
                    System.out.print('^');
                else if (field[row][col]==2)
                    System.out.print('X');
                else if (field[row][col]==1)
                    System.out.print('x');
                else
                    System.out.print('.');

            }if (row<field.length-1)
            System.out.println();
        }
    }
// Create an array where we will "draw" the current game state
    // Draw all the parts of the snake
    // Draw the mouse
    // Display it all on the screen

    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args) throws InterruptedException {
        game = new RoomRescue(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
        //game.print();
    }

    public void sleep() throws InterruptedException {
        int sleepTime = 520 - (getSnake().getSections().size() * 20);
        if (getSnake().getSections().size() > 15)
            Thread.sleep(200);
        else Thread.sleep(sleepTime);

        // Pause. The length of the pause depends on the length of the snake
    }
}
*/
