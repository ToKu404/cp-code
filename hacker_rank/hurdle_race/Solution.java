import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int countHundler = inp.nextInt();
        int maximumPlayerJump = inp.nextInt();

        int hurdleHeight[] = new int[countHundler];

        for (int i = 0; i < hurdleHeight.length; i++) {
            hurdleHeight[i] = inp.nextInt();
        }

        hurdleRace(maximumPlayerJump, hurdleHeight);
        inp.close();
    }

    private static void hurdleRace(int maximumPlayerJump, int[] hurdleHeight) {
        int max = hurdleHeight[0];

        for (int i = 1; i < hurdleHeight.length; i++) {
            if(max < hurdleHeight[i]){
                max = hurdleHeight[i];
            }
        }
        int magicPotion = max > maximumPlayerJump ? max - maximumPlayerJump : 0;
        System.out.println(magicPotion);
    }
}