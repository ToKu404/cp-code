import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row = inp.nextInt();
        int col = inp.nextInt();
        int time = inp.nextInt();
        inp.nextLine();
        String grid [] = new String[row];
        for (int i = 0; i < grid.length; i++) {
            grid[i] = inp.nextLine();
        }
        int gridNum[][] = charToASCII(grid, row, col);
        bomberMan(gridNum, time);
        inp.close();
    }

    private static void bomberMan(int[][] gridNum, int time) {
        if(time%2==0){
            for (int j = 0; j < gridNum.length; j++) {
                for (int k = 0; k < gridNum[j].length; k++) {
                    gridNum[j][k] = 79;
                }
            }
        }
        else if(time>1){
            gridNum = boom(gridNum);
            if(time%4==1){
                gridNum = boom(gridNum);
            }
        }
        showGrid(gridNum);
    }

    private static int[][] boom(int[][] gridNum){
        int temp[][] = new int[gridNum.length][gridNum[0].length];
                    for (int j = 0; j < temp.length; j++) {
                        for (int k = 0; k < temp[j].length; k++) {
                            temp[j][k] = 46;
                        }
                    }
                for (int j = 0; j < gridNum.length; j++) {
                    for (int k = 0; k < gridNum[j].length; k++) {
                        if(gridNum[j][k]==79){
                            if(j>0){
                                temp[j-1][k] = 79;
                            }
                            if(j<gridNum.length-1){
                                temp[j+1][k] = 79;
                            }
                            if(k>0){
                                temp[j][k-1] = 79;
                            }
                            if(k<gridNum[j].length-1){
                                temp[j][k+1] = 79;
                            }
                        }
                    }
                }
                for (int j = 0; j < gridNum.length; j++) {
                    for (int k = 0; k < gridNum[j].length; k++) {
                        if(gridNum[j][k] == 79 || temp[j][k] == 79){
                            gridNum[j][k] = 46;
                        }else{
                            gridNum[j][k] = 79;
                        }
                    }
                }
                return gridNum;
    }

    private static void showGrid(int[][] gridNum) {
        for (int i = 0; i < gridNum.length; i++) {
            for (int j = 0; j < gridNum[i].length; j++) {
                System.out.print((char) gridNum[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] charToASCII(String[] grid, int r, int c) {
        int gridNum [][] = new int[r][c];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                gridNum[i][j] = grid[i].charAt(j);
            }
        }
        return gridNum;
    }
}