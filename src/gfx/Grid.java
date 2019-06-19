package gfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private static Cell[][] cells;
    private static final int PADDING = 10;
    private static int cols;
    private static int rows;
    private Rectangle rectangle;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        rectangle = new Rectangle(0,0 , cols, rows);
        cells = new Cell[cols][rows];
    }

    public Cell getCells(int col, int row) {
        return cells[col][row];
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }



    public void init() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[col][row] = new Cell(col, row);
                cells[col][row].show();
            }
        }

    }

    public static String printString() {
        String gridString = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                 gridString += cells[col][row].toString();
            }
            gridString += "\n";
        }
        return gridString;
    }
}

