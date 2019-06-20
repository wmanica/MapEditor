package gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {


    public static final int CELL_SIZE = 15;
    private int col;
    private int row;
    private boolean paintedBlack;
    private boolean paintedRed;
    private boolean paintedPink;
    protected Rectangle rectangle;


    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }


    @Override
    public String toString() {
        if (paintedBlack) {
            return "1";
        } else if (paintedPink) {
            return "2";
        } else if (paintedRed) {
            return "3";
        } else {
            return "0";
        }
    }

    /**
     * toString()
     @Override public String toString() {
     return paintedBlack ? "1" : "0";
     }    }*/

    /**
     * GETTER / SETTER COLORS
     */
    public boolean isPaintedBlack() {
        return paintedBlack;
    }

    public void setPaintedBlack(boolean paintedBlack) {
        this.paintedBlack = paintedBlack;
    }

    public boolean isPaintedRed() {
        return paintedRed;
    }

    public void setPaintedRed(boolean paintedRed) {
        this.paintedRed = paintedRed;
    }

    public boolean isPaintedPink() {
        return paintedPink;
    }

    public void setPaintedPink(boolean paintedPink) {
        this.paintedPink = paintedPink;
    }

    /**
     * show cell
     */
    public void show() {
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    /**
     * paintBlack cell
     */
    public void paintBlack() {
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }

    public void paintRed() {
        rectangle.setColor(Color.RED);
        rectangle.fill();
    }

    public void paintPink() {
        rectangle.setColor(Color.PINK);
        rectangle.fill();
    }

}
