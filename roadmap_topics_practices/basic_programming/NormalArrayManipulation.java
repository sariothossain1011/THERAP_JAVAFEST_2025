package roadmap_topics_practices.basic_programming;

public class NormalArrayManipulation {

    public static void main(String[] args) {
        // ________________one dimentsonal normal array________________
        int[] oneDArray = new int[] { 1, 2, 3, 4, 5 };

        // one dimentsonal array updating process
        oneDArray[2] = 6;
        System.out.println(oneDArray[2]);

        // one dimentsonal array inserting process
        int[] newInsertArray = new int[oneDArray.length + 1];
        System.arraycopy(oneDArray, 0, newInsertArray, 0, 3);
        System.arraycopy(oneDArray, 3, newInsertArray, 4, oneDArray.length - 3);
        newInsertArray[3] = 9;
        oneDArray = newInsertArray;
        System.out.println(oneDArray[3]);

        // one dimentsonal array deleting process
        int[] newDeleteArray = new int[oneDArray.length - 1];
        System.arraycopy(oneDArray, 0, newDeleteArray, 0, 4);
        System.arraycopy(oneDArray, 4, newDeleteArray, 4, oneDArray.length - 5);
        oneDArray = newDeleteArray;
        System.out.println(oneDArray[2]);

        System.out.println();
        for (int data : oneDArray) {

            System.out.println(data);
        }

        // __________two dimensional normal array___________
        int[][] twoDArray = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // two dimensional array updating process
        twoDArray[1][2] = 10;// updated value 6 to 10;

        // two dimensional array inserting process
        int[][] newTwoDInsertArray = new int[4][3]; // Declaring new two dimensional array
        for (int i = 0; i < twoDArray.length; i++) {
            System.arraycopy(twoDArray[i], 0, newTwoDInsertArray[i], 0, twoDArray[i].length);
        }
        newTwoDInsertArray[3] = new int[] { 10, 11, 12 };
        System.out.println(newTwoDInsertArray[3][0]); // print: row 3 and column 0 ,result 6

        // two dimensional array deleting process
        int[][] newTwoDDeleteArray = new int[twoDArray.length - 1][];
        System.arraycopy(twoDArray, 0, newTwoDDeleteArray, 0, 1); // Copy rows before deletion
        System.arraycopy(twoDArray, 2, newTwoDDeleteArray, 1, 1); // Copy rows after deletion

        // tow dimensional array output
        for (int[] row : newTwoDDeleteArray) {
            for (int value : row) { // Iterate through each value in the row
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }

    }
}