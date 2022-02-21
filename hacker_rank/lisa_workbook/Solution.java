import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int maxVal = inp.nextInt();

        int chapter[] = new int[n];
        for (int i = 0; i < chapter.length; i++) {
            chapter[i] = inp.nextInt();
        }
        lisaWorkbook(maxVal, chapter);

        inp.close();
    }

    private static void lisaWorkbook(int maxVal, int[] chapter) {
        int page = 0;
        int same = 0;
        for (int i = 0; i < chapter.length; i++) {
            int lower = 1;
            int upper = chapter[i]>=maxVal? maxVal : chapter[i];
            while (chapter[i]>0) {
                page++;
                chapter[i]-=maxVal;
                if(page>=lower && page<=upper){
                    // System.out.println("same" + " lower: "+lower + " upper: " + upper +" page " + page);
                    same++;
                }
                lower = upper+1;
                upper += chapter[i]>=maxVal? maxVal : chapter[i];

            }
        }
        System.out.println(same);
    }

    private static void lisaWorkbook2(int maxVal, int[] chapter){
        int result = 0;
        int page = 1;

        for(int i = 0; i < chapter.length; i++) {
            int problems = chapter[i];

            for(int problem = 1; problem <= problems; problem++) {
                if(problem == page) {
                    result++;
                }
                if((problem % maxVal == 0) || problem == problems) {
                    page++;
                }
            }
        }
        System.out.println(result);
    }
}