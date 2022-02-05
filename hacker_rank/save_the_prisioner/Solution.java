import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        long data[][] = new long[n][3];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = inp.nextInt();
            }
        }
        savePrisioner(data);
        inp.close();
    }

    private static void savePrisioner(long[][] data) {
        for (int i = 0; i < data.length; i++) {
            long warnPrisioner = (data[i][1] % data[i][0] == 0 && data[i][2]==1) ? data[i][0] : (data[i][1] % data[i][0]) + (data[i][2]-1);
            if(warnPrisioner > data[i][0]){
                warnPrisioner %= data[i][0];
            }
            System.out.println(warnPrisioner);
        }
    }
}