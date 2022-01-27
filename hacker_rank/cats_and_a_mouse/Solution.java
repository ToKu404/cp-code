import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int cases[][] = new int[n][3];
        for (int i = 0; i < cases.length; i++) {
            for (int j = 0; j < cases[i].length; j++) {
                cases[i][j] = inp.nextInt();
            }
        }

        catAndMouse(cases);

        inp.close();
    }

    private static void catAndMouse(int[][] cases) {
        for (int i = 0; i < cases.length; i++) {
            int temp1 = cases[i][2]>=cases[i][0] ? cases[i][2]-cases[i][0] : cases[i][0]-cases[i][2];
            int temp2 = cases[i][2]>=cases[i][1] ? cases[i][2]-cases[i][1] : cases[i][1]-cases[i][2];
            System.out.println(temp1 + " " + temp2);
            if(temp1==temp2){
                System.out.println("Mouse C");
            }else{
                System.out.println(temp1<temp2 ? "Cat A" : "Cat B");
            }
        }
    }

    private static void catAndMouse2(int[][] cases) {
        for (int i = 0; i < cases.length; i++) {
            int xDist=Math.abs(cases[i][0] - cases[i][2]);
            int yDist=Math.abs(cases[i][1] - cases[i][2]);
            String result = xDist < yDist ? "Cat A": xDist > yDist ? "Cat B":"Mouse C";
            System.out.println(result);
        }
    }
}