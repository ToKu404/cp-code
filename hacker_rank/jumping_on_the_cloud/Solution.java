import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int cloud[] = new int[n];

        for (int i = 0; i < cloud.length; i++) {
            cloud[i] = inp.nextInt();
        }

        jumpingCloud(cloud);
        inp.close();
    }

    private static void jumpingCloud(int[] cloud) {
        int i = 0;
        int jump = 0;
        while(i < cloud.length-1){
            jump ++;
            i += i < cloud.length-2 && cloud[i+2]==0 ? 2 : 1;
        }
        System.out.println(jump);        
    }
}