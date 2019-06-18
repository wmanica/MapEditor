package gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.*;

public class Cursor extends Cell implements KeyboardHandler {

    public Cursor(int col, int row) {
        super(col, row);
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
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


    public void moveLeft() {
        System.out.println("left");
        rectangle.translate(-1 * CELL_SIZE,0 );
    }

    public void moveRight() {
        System.out.println("right");
        rectangle.translate(1 * CELL_SIZE,0 );
    }

    public void moveUp() {
        System.out.println("right");
        rectangle.translate(0,-1 * CELL_SIZE );
    }

    public void moveDown() {
        System.out.println("right");
        rectangle.translate(0,1 * CELL_SIZE );
    }
}
