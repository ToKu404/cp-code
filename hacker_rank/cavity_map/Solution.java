import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();


        String strNum[] = new String[n];
        for (int i = 0; i < strNum.length; i++) {
            strNum[i] = inp.next();
        }

        int map[][] = new int[n][n];

        for (int i = 0; i < strNum.length; i++) {
            for (int j = 0; j < strNum[i].length(); j++) {
                map[i][j] = Integer.valueOf(strNum[i].substring(j,j+1));
            }
        }

        cavityMap(map);

        inp.close();
    }

    private static void cavityMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                boolean isCavity = false;
                if(i!=0 && j!=0 && i!=map.length-1 && j != map.length-1){
                    boolean leftSide = map[i+1][j]<map[i][j];
                    boolean bottomSide = map[i][j+1]<map[i][j];
                    boolean rightSide = map[i-1][j]<map[i][j];
                    boolean topSide = map[i][j-1]<map[i][j];
                    if(leftSide&&bottomSide&&rightSide&&topSide){
                        isCavity = true;
                    }
                }
                System.out.print(isCavity ? "X" : map[i][j]);
            }
            System.out.println();
        }
    }
}