import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        String[] isCancell = new String[n];

        for (int i = 0; i < isCancell.length; i++) {
            int students = inp.nextInt();
            int threshold = inp.nextInt();
            int passed = 0;
            for (int j = 0; j < students; j++) {
                int arrive = inp.nextInt();
                if(arrive<=0){
                    passed++;
                }
            }
            if(passed>=threshold){
                isCancell[i] = "NO";
            }else{
                isCancell[i] = "YES";
            }
        }

        for (int i = 0; i < isCancell.length; i++) {
            System.out.println(isCancell[i]);
        }

        inp.close();
    }
}