package gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.*;

import javax.swing.text.Position;

public class Cursor extends Cell implements KeyboardHandler {

    public static final int DISTANCE = 0;
    private Position position;
    private Grid grid;

    public Cursor(int col, int row, Grid grid) {
        super(col, row);
        this.grid = grid;
        rectangle.setColor(Color.LIGHT_GRAY);
        rectangle.fill();
    }

    public void keyMove() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRight);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventUp);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventDown);

        KeyboardEvent eventPaint = new KeyboardEvent();
        eventPaint.setKey(KeyboardEvent.KEY_SPACE);
        eventPaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventPaint);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            moveLeft();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            moveRight();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            moveUp();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            moveDown();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            cursorPaint();
            System.out.println(position);
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


    public void moveLeft() {
        System.out.println("left");
        rectangle.translate(-1 * CELL_SIZE, 0);
        setCol(getCol() - 1);
    }


    public void moveRight() {
        if ((getCol()) < (grid.getCols()-1)) {
            rectangle.translate(1 * CELL_SIZE, 0);
            setCol(getCol() + 1);
            System.out.println("right");
        }
    }

    public void moveUp() {
        System.out.println("up");
        rectangle.translate(0, -1 * CELL_SIZE);
        setRow(getRow() - 1);
    }

    public void moveDown() {
        System.out.println("down");
        rectangle.translate(0, 1 * CELL_SIZE);
        setRow(getRow() + 1);
    }

    public void cursorPaint() {
        System.out.println("paint");
        grid.getCells(getCol(),getRow()).paint();
    }
}
