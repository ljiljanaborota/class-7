package class11;

public class Example1 {
    public static void main(String[] args) {
        // write the loop that print only odd numbers from  the elements from the 2D array
        int[][] matrix = {{10,20,30},
                {45,55,66},
                {30,40,20,10,25}
        };
        for (int i = 0; i < matrix.length; i++) {   // matrix.length will tell  me whole row
            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length tell us how many 1D array are present
                // in this 2D array
                if (matrix[i][j] % 2 != 0) { // will print only odd number

                    System.out.print(matrix[i][j] +" ");
                }
                System.out.println(); // this is to print one under another,have to be out of the }
            }
        }
    }
}


