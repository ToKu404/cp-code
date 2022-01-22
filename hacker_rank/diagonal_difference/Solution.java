import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int val[][] = new int[n][n];

        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                val[i][j] = inp.nextInt();
            }
        }
        int result = diagonalDifference(val);
        System.out.println(result);
    }

    static int diagonalDifference(int arr[][]){
        int left = 0;
        int right = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(i==j){
                    left += arr[i][j];
                }
                if(i+j==arr.length-1){
                    right += arr[i][j];
                }
            }
        }
        return (right > left) ? right - left : left - right;
    }
}
