import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day = inp.nextInt();
        viralAdverstising(day);
        inp.close();
    }

    private static void viralAdverstising(int day) {
        int shared = 5;
        int liked = 2;
        int cum = 2;
        for (int i = 1; i < day; i++) {
            shared = liked * 3;
            liked = shared / 2;
            cum += liked;
        }
        System.out.println(cum);

    }
}