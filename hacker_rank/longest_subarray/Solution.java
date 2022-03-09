import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        List<Long> arr = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            Long num = inp.nextLong();
            arr.add(num);
        }
        Collections.sort(arr);   
        longestSubarray(arr);
        inp.close();
    }

    private static void longestSubarray(List<Long> arr) {
        int maxSubarray = 1;
        int temp = 1;
        int index = 0;
        for (int i = index; i < arr.size(); i++) {
            for (int j = 1+i; j < arr.size(); j++) {
                int lastIndex = j;
                System.out.println("i " + i + "j " + j);
                System.out.println("get i " + arr.get(i) + " get j "+ arr.get(j));
                if(arr.get(j).equals(arr.get(i))){
                    temp++;
                    lastIndex = j+1;
                }
                else if(arr.get(j)-arr.get(i)==1){
                    temp++;
                }
                else{ 
                    index = lastIndex;
                    break;
                }
                System.out.println("temp = " + temp);
                
            }
            if(temp>maxSubarray){
                maxSubarray = temp;
            }
            temp = 1;
            
        }
        System.out.println(maxSubarray);
    }
}