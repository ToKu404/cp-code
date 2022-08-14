import java.util.Scanner;

class Solution {
    //this solution not clear ==> recomended use arraylist 
    // then remove group colors
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = inp.nextInt();

        String[] result = new String[n];

        for (int i=0; i<n ;i++){
            int len = inp.nextInt();
            result[i] = happyLadyBugHappy(len);
        }

        for(String res : result){
            System.out.println(res);
        }

        inp.close();
    }

    private static String happyLadyBugHappy(int len) {
        inp.nextLine();
        String text = inp.nextLine();
        
        if(len<=1 && text.charAt(0) != '_'){
            return "NO";
        }
        boolean hasSpace = false;

        for(int i=0;i<len;i++){
            if(text.charAt(i) == '_'){
                hasSpace = true;
                break;
            }
        }

        for (int i = 0; i < len; i++) {
            int numI = (int) text.charAt(i);

            if((numI>=65 && numI<=90)){
                final boolean isPerfect = checkPerfect(i, text, len);
                boolean status = checkStatus(text, numI, hasSpace, len, i, isPerfect);
                if(!status){
                    return "NO";
                }
            }
            
        }
        return "YES";
    }

    private static boolean checkPerfect(int i, String text, int len) {
        for (int j = 0; j < len; j++) {
            if(j==0){
                if(text.charAt(j)!=text.charAt(j+1)){
                    return false;
                }
            }
            else if(j==len-1){
                if(text.charAt(j)!=text.charAt(j-1)){
                    return false;
                }
            }
            else {
                if(text.charAt(j)!=text.charAt(j-1)&&text.charAt(j)!=text.charAt(j+1)){
                    return false;
                }
            }
        }
        return true;
    }

    private static Boolean checkStatus(String text, int numI, boolean hasSpace, int len, int i, boolean isPerfect) {
        for (int j=0; j < len; j++){
            if(i!=j){
                int numJ = (int) text.charAt(j);
                if((numJ>=65 && numJ<=90)){
                    if(numI == numJ){
                        return true;
                    }else{
                        if(!hasSpace && !isPerfect){
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}