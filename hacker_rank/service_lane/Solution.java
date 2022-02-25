import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int t = inp.nextInt();
        int lane[] = new int[n];
        for (int i = 0; i < lane.length; i++) {
            lane[i] = inp.nextInt();
        }
        int cases[][] = new int[t][2];
        for (int i = 0; i < cases.length; i++) {
            cases[i][0] = inp.nextInt();
            cases[i][1] = inp.nextInt();
        }

        serviceLane(cases, lane);
        inp.close();
    }

    private static void serviceLane(int[][] cases, int[] lane) {
        for (int i = 0; i < cases.length; i++) {
            int min = lane[cases[i][0]];
            for (int j = cases[i][0]+1; j <= cases[i][1]; j++) {
                if(min>lane[j]){
                    min=lane[j];
                }
            }
            System.out.println(min);
        }
    }
}