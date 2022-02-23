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
                differenceNum[i][0] = temp;
            }
        }

        manasaStone(countStone, differenceNum);

        inp.close();
    }

    private static void manasaStone(int[] countStone, int[][] differenceNum) {
        
    
        for (int i = 0; i < countStone.length; i++) {
            if(differenceNum[i][0]==differenceNum[i][1]){
                System.out.print(differenceNum[i][0]*(countStone[i]-1));
            }
            else{
                int useB = 0;
                int useA = countStone[i]-1;
                for (int j = 0; j < countStone[i]; j++) {
                    int lastVal = useA * differenceNum[i][0] + useB * differenceNum[i][1];
                    System.out.print(lastVal + " ");
                    useB++;
                    useA--;
                }
            }
            System.out.println();
        }
    }
}