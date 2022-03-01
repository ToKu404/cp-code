import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        String text[] = new String[n];
        for (int i = 0; i < text.length; i++) {
            text[i] = inp.nextLine();
        }

        alternatingCharacter(text);

        inp.close();
    }

    private static void alternatingCharacter(String[] text) {
        for (int i = 0; i < text.length; i++) {
            char before = text[i].charAt(0);
            int conflict = 0;
            for (int j = 1; j < text[i].length(); j++) {
                if(before == text[i].charAt(j)){
                    conflict++;
                }
                before = text[i].charAt(j);
            }
            System.out.println(conflict);
        }
    }
}