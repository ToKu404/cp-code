import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        int score[] = new int[n];
        for (int i = 0; i < score.length; i++) {
            score[i] = inp.nextInt();
        }

        bestWorstRecord(score);

        inp.close();
    }

    private static void bestWorstRecord(int[] score) {
        int best = score[0], worst=score[0], breakBest=0, breakWorst = 0;
        for (int i = 1; i < score.length; i++) {
            if(score[i]>best){
                best = score[i];
                breakBest++;
            }
            if(score[i]<worst){
                worst = score[i];
                breakWorst++;
            }
        }
        System.out.println(breakBest + " " + breakWorst);
    }
}