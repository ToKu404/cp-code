import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int alice[] = new int[3];
        int bob[] = new int[3];
        
        
        for (int i = 0; i < alice.length; i++) {
            alice[i] = inp.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            bob[i] = inp.nextInt();
        }

        compareTriplets(alice, bob);

        inp.close();
    }

    private static void compareTriplets(int[] alice, int[] bob) {
        int aliceScore = 0, bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if(alice[i]>bob[i])
                aliceScore++;
            else if(alice[i]<bob[i])
                bobScore++;
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}