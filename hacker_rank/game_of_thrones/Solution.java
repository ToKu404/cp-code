import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String text = inp.next();
        gameOfThrones(text.toLowerCase());
        inp.close();
    }

    private static void gameOfThrones(String text) {
        int charInt[] = new int[text.length()];
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            charInt[i] = (int) text.charAt(i);
            if(max < charInt[i]){
                max = charInt[i];
            }
        }    
        int countInt[] = new int[max-96];
        for (int i = 0; i < charInt.length; i++) {
            countInt[charInt[i]-97] += 1;
        }
        int one = 0;
        for (int i = 0; i < countInt.length; i++) {
            if(countInt[i]%2!=0){
                one++;
            }
            if(countInt[i]%2!=0 && one>1){
                System.out.println("NO");
                return;
            }
        } 
        System.out.println("YES");
    }
}