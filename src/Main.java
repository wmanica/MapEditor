import gfx.Cursor;
import gfx.Grid;
import gfx.SaveLoad;

public class Main {

    public static void main(String[] args) {

        Grid gridTest = new Grid(40, 40);
        gridTest.init();

        Cursor cursor = new Cursor(0,0 , gridTest);
        cursor.keyMove();

    }
}
