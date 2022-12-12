package Unit_4._4_4.uprightnumbertriangle;

public class NumberTriangle {
    public static void main(String[] args) {
        makeNumberTriangle();
    }

    public static void makeNumberTriangle() {
        //print appropriate amount of rows
        for (int i = 1; i < 7; i++) {
            //print appropriate amount of numbers per row, based on i in outer loop and incrementing by 1
            for (int j = 1; j < i; j++) {
                System.out.print( j + " ");
            }
            //Move to next line
            System.out.println();
        }
    }
}
