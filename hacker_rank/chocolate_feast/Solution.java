import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int choco[][] = new int[n][3];

        for (int i = 0; i < choco.length; i++) {
            for (int j = 0; j < choco[i].length; j++) {
                choco[i][j] = inp.nextInt();
            }
        }

        chocolateFeast(choco);

        inp.close();
    }

    private static void chocolateFeast(int[][] choco) {
        for (int i = 0; i < choco.length; i++) {
            int eat = choco[i][0]/choco[i][1];
            int pembungkus = eat;
            while(pembungkus >= choco[i][2]){
                pembungkus -= choco[i][2];
                eat++;
                pembungkus++;
            }
            System.out.println(eat);
        }
    }
}