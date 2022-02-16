import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        equalityInArray(arr);

        inp.close();
    }

    private static void equalityInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int countArr[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]] ++;
        }

        int maxCount = 0;
        int indexMax = 0;
        for (int i = 0; i < countArr.length; i++) {
            if(maxCount<countArr[i]){
                maxCount = countArr[i];
                indexMax = i;
            }
        }

        int remove = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=indexMax){
                remove++;
            }
        }

        System.out.println(remove);
    }

    private static void equalityInArray2(int[] arr){
        int max = 1;
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i : arr)
            if (!nums.containsKey(i))
                nums.put(i, 1);
            else {
                nums.put(i, nums.get(i) + 1);
                if (max < nums.get(i))
                    max = nums.get(i);
            }
        System.out.println(arr.length - max);
    }
}

