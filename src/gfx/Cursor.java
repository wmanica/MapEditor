package gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.*;

import javax.swing.text.Position;

public class Cursor extends Cell implements KeyboardHandler {

    public static final int DISTANCE = 0;
    private Position position;
    private Grid grid;
    private FileManager fileManager;


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

        KeyboardEvent eventRed = new KeyboardEvent();
        eventRed.setKey(KeyboardEvent.KEY_1);
        eventRed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRed);

        KeyboardEvent eventPink = new KeyboardEvent();
        eventPink.setKey(KeyboardEvent.KEY_2);
        eventPink.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventPink);

        KeyboardEvent eventSave = new KeyboardEvent();
        eventSave.setKey(KeyboardEvent.KEY_S);
        eventSave.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventSave);
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
            brush();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            red();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            pink();
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            System.out.println(Grid.printString());
            fileManager.writeToFile(Grid.printString());
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


    public void moveLeft() {
        if (getCol() > 0) {
            rectangle.translate(-1 * CELL_SIZE, 0);
            setCol(getCol() - 1);
        }
    }


    public void moveRight() {
        if ((getCol()) < (grid.getCols() - 1)) {
            rectangle.translate(1 * CELL_SIZE, 0);
            setCol(getCol() + 1);
        }
    }

    public void moveUp() {
        System.out.println("up");
        if (getRow() > 0) {
            rectangle.translate(0, -1 * CELL_SIZE);
            setRow(getRow() - 1);
        }
    }

    public void moveDown() {
        System.out.println("down");
        if ((getRow()) < (grid.getRows() - 1)) {
            rectangle.translate(0, 1 * CELL_SIZE);
            setRow(getRow() + 1);
        }
    }

    public void brush() {
        if (!grid.getCells(getCol(), getRow()).isPaintedBlack()) {
            System.out.println("paintBlack");
            grid.getCells(getCol(), getRow()).paintBlack();
            grid.getCells(getCol(), getRow()).setPaintedBlack(true);

        } else {
            System.out.println("clear");
            grid.getCells(getCol(), getRow()).show();
            grid.getCells(getCol(), getRow()).setPaintedBlack(false);
        }
    }

    public void red() {
        if (!grid.getCells(getCol(), getRow()).isPaintedRed()) {
            System.out.println("paintRed");
            grid.getCells(getCol(), getRow()).paintRed();
            grid.getCells(getCol(), getRow()).setPaintedRed(true);

        } else {
            System.out.println("clear");
            grid.getCells(getCol(), getRow()).show();
            grid.getCells(getCol(), getRow()).setPaintedRed(false);
        }
    }

    public void pink() {
        if (!grid.getCells(getCol(), getRow()).isPaintedPink()) {
            System.out.println("paintPink");
            grid.getCells(getCol(), getRow()).paintPink();
            grid.getCells(getCol(), getRow()).setPaintedPink(true);

        } else {
            System.out.println("clear");
            grid.getCells(getCol(), getRow()).show();
            grid.getCells(getCol(), getRow()).setPaintedPink(false);
        }
    }

}
