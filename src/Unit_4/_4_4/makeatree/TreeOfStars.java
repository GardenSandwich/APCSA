package Unit_4._4_4.makeatree;

public class TreeOfStars {
    public static void main(String[] args) {
        makeATree();
    }

    public static void makeATree() {
        //print 9 rows tall
        for (int i = 0; i < 9; i++) {
            //Print out appropriate amount of spaces leading up to stars based on i (starting with 0 spaces ang growing to 8)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //Print out appropriate amount of stars based on i (starting with 9 stars and shrinking to 1)
            for (int k = 9; k > i; k--) {
                System.out.print("* ");
            }
            //Move to next line
            System.out.println();
        }
    }
}
