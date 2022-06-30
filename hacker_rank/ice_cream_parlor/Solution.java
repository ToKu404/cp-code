import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] result = new int[n][2];
        for(int i = 0; i<n; i++){
            int k = inp.nextInt();
            int count = inp.nextInt();
            int[] arr = new int[count];
            for(int j=0;j<arr.length;j++){
                arr[j] = inp.nextInt();
            }

            for (int a = 0; a < arr.length-1; a++) {
                for (int b = a+1; b < arr.length; b++) {
                    if(arr[a]>=k || arr[b]>=k) continue;
                    if((arr[b]+arr[a]) == k){
                        result[i][0] = a+1;
                        result[i][1] = b+1;
                    }
                }
            }
        }
        for (int[] is : result) {
            System.out.println(is[0] + " " + is[1]);
        }
        inp.close();
    }
}