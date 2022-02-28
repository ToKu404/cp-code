import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        String text = inp.nextLine();

        marsExploration(text);

        
        inp.close();
    }

    private static void marsExploration(String text) {
        int difference = 0;
        for (int i = 0; i < text.length(); i+=3) {
            String temp = text.substring(i, i+3);
            if(!temp.equals("SOS")){
                difference += !temp.substring(0,1).equals("S") ? 1:0;
                difference += !temp.substring(1,2).equals("O") ? 1:0;
                difference += !temp.substring(2,3).equals("S") ? 1:0;
            }
        }
        System.out.println(difference);
    }
}