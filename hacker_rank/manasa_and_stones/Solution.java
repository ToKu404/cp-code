import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        int countStone[] = new int[n];
        int differenceNum[][] = new int[n][2];
        
        for (int i = 0; i < countStone.length; i++) {
            countStone[i] = inp.nextInt();
            differenceNum[i][0] = inp.nextInt();
            differenceNum[i][1] = inp.nextInt();
            if(differenceNum[i][0]>differenceNum[i][1]){
                int temp = differenceNum[i][1];
                differenceNum[i][1] = differenceNum[i][0];
                differenceNum[i][1] = temp;
            }
        }

        manasaStone(countStone, differenceNum);

        inp.close();
    }

    private static void manasaStone(int[] countStone, int[][] differenceNum) {
        int permutationCount[] = new int[countStone.length];
        for (int i = permutationCount.length; i > 2; i--) {
            permutationCount[i]*=i;
        }



        for (int i = 0; i < countStone.length; i++) {
            int j = 0;
            while (j<permutationCount[i]){
                int last = 0;
                int l = 0;
                for (int k = 0; k < countStone[i]-1; k++) {
                    last+=countStone[l];
                }
            }
        }
    }
}