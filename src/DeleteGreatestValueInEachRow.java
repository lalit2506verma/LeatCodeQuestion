import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        int result = deleteMax(arr);

        System.out.println(result);
    }

    static int deleteMax(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;

        if(rows==1 && cols == 1){
            return grid[0][0];
        }

        // loop for the rows of matrix
        for (int i = 0; i < rows; i++) {

            // loop for the column of matrix
            for (int j = 0; j < cols; j++) {

                // loop for the comparison and sorting
                for (int k = 0; k < cols - j - 1; k++) {
                    if(grid[i][k] > grid[i][k + 1]){

                        // swapping the values
                        int temp = grid[i][k];
                        grid[i][k] = grid[i][k + 1];
                        grid[i][k + 1] = temp;


                    }

                }

            }
        }
        int total = 0;
        //after this we have row wise sorted 2D array
        for (int i = cols-1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < rows; j++) {
                if(grid[j][i] > max){
                    max = grid[j][i];
                }
            }
            total += max;
        }


        /*
        // printing the sorted matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
         */

        return total;
    }
}
