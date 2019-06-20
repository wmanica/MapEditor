package gfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private static Cell[][] cells;
    private static final int PADDING = 10;
    private int cols;
    private int rows;
    private Rectangle rectangle;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        rectangle = new Rectangle(0, 0, cols, rows);
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


    @Override
    public String toString() {
        String gridString = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                gridString += cells[col][row].toString();
            }
            gridString += "\n";
        }
        return gridString;
    }


    /**
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
     */



    public void stringToGrid(String toLoad) {
        int index = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cell cell = cells[col][row];

                if (toLoad.charAt(index)== '1') {
                    cell.paintBlack();
                } else if(toLoad.charAt(index)== '2') {
                    cell.paintPink();
                } else if(toLoad.charAt(index)== '3') {
                    cell.paintRed();
                } else {
                    cell.show();
                }

                index++;
            }
            index++;
        }

    }
}

