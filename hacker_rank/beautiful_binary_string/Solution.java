import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        String binaryArray = inp.nextLine();

        beautifulBinaryString(binaryArray);

        inp.close();
    }

    private static void beautifulBinaryString(String binaryArray) {
        int changeNum = 0;
        String exceptCase = "010";
        int index = 0;
        while ((binaryArray.length()-index)>=3) {
            if(binaryArray.substring(index, index+3).equals(exceptCase)){
                if((binaryArray.length()-index)>=5){
                    if(binaryArray.substring(index+2, index+5).equals(exceptCase)){
                        changeNum++;
                        index+=4;
                    }
                    else{
                        index+=3;
                        changeNum++;
                    }
                }else{
                    changeNum++;
                    index+=3;
                }
            }else{
                index++;
            }
        }
        System.out.println(changeNum);
    }
}