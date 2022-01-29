import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        String p = inp.next();

        countingValleys(n, p);
        inp.close();
    }

    private static void countingValleys(int n, String p) {
        String path[] = p.split("");
        int deepHigh = 0;
        boolean fromSeaLevel = true;
        int countValleys = 0;
        for (int i = 0; i < path.length; i++) {
            deepHigh = path[i].equals("U") ? deepHigh + 1 : deepHigh - 1;
            if(deepHigh<0 && fromSeaLevel==true){
                countValleys++;
            }
            fromSeaLevel = deepHigh == 0 ? true : false;
        }
        System.out.println(countValleys);
    }

    private static void countingValleys2(int n, String p){
        int v = 0;     
        int lvl = 0;   
        for(char c : p.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            if(lvl == 0 && c == 'U')
                ++v;
        }
        System.out.print(v);
    }
}