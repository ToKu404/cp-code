import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }

        formingMagicSquare(matrix);

        inp.close();
    }

    private static void formingMagicSquare(int[][] matrix) {
        int row[] = new int[3];
        int col[] = new int[3];
        int dg[] = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                row[i] += matrix[i][j];
                col[i] += matrix[j][i];
                if(i==j){
                    dg[0] += matrix[i][j];
                }
                if(i+j==2){
                    dg[1] += matrix[i][j];
                }
            }
        }
        
        // ArrayList<Integer> squares = new ArrayList<Integer>();

        // for (int i = 0; i < row.length; i++) {
        //     squares.add(row[i]);
        // }
        // for (int i = 0; i < col.length; i++) {
        //     squares.add(col[i]);
        // }
        // for (int i = 0; i < dg.length; i++) {
        //     squares.add(dg[i]);
        // }
        
    }
}