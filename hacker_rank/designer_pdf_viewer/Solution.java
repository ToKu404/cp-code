import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int characters[] = new int[26];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = inp.nextInt();
        }

        inp.nextLine();
        String words = inp.nextLine();


        calculateArea(words, characters);

        inp.close();
    }

    private static void calculateArea(String words, int characters[]) {
        String cleanWord = words.trim();
        int max = 0;
        for (int i = 0; i < cleanWord.length(); i++) {
            char character = cleanWord.charAt(i);
            int index = ((int) character) - 97;
            if (characters[index] > max) {
                max = characters[index];
            }
        }

        System.out.println(cleanWord.length() * max);
    }
}