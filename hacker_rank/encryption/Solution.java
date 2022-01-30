import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String text = inp.nextLine();

        String cleanText = text.toLowerCase().strip().replaceAll(" ", "");

        textEncryption(cleanText);
        inp.close();

    }

    private static void textEncryption(String cleanText) {
        double root = Math.sqrt(cleanText.length());
        int row = (int) root;
        int column = root > row ? row + 1 : row;
        String encrypted = "";
        for (int i = 0; i<column; i++){
            int index = i;
            while(index < cleanText.length()){
                encrypted += cleanText.charAt(index);
                index += column;
            }
            encrypted += " ";
        }
        System.out.println(encrypted);
    }
}