package gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {


    public static final int CELL_SIZE = 15;
    private int col;
    private int row;
    protected Rectangle rectangle;


    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE );
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

    /**
     * show cell
     */
    public void show() {
        rectangle.draw();
    }

    /**
     * paint cell
     */
    public void paint() {
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }



}
