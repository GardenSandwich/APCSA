package Unit_8.labs.CenteredPascalsTriangle;

public class CenteredPascalsTriangle {
    public static void printCenteredTriangle(int rows) {
        int[][] pascal = new int[rows][rows];
        //generate triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }

            }
        }

        //print the triangle, justified to the center with \t
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCenteredTriangle(13);
    }

    /*
     * prints:
        											1
												1		1
											1		2		1
										1		3		3		1
									1		4		6		4		1
								1		5		10		10		5		1
							1		6		15		20		15		6		1
						1		7		21		35		35		21		7		1
					1		8		28		56		70		56		28		8		1
				1		9		36		84		126		126		84		36		9		1
			1		10		45		120		210		252		210		120		45		10		1
		1		11		55		165		330		462		462		330		165		55		11		1
	1		12		66		220		495		792		924		792		495		220		66		12		1
    */
}
