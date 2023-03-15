package Unit_9._9_7.twodarraytester;

public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){
        if (myArray.length != other.length){
            return false;
        }

        for (int i = 0; i < this.myArray.length; i++) {
            if (myArray[i].length != other[i].length){
                return false;
            }

            for (int j = 0; j < myArray[i].length; j++) {
                if (!myArray[i][j].equals(other[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

}

