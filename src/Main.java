import gfx.Cursor;
import gfx.Grid;

public class Main {

    public static void main(String[] args) {

        Grid gridTest = new Grid(20, 20);
        gridTest.init();

        Cursor cursor = new Cursor(0,0 , gridTest);
        cursor.keyMove();
    }
}
