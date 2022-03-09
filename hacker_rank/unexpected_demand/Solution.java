import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        // int order[] = new int[n];
        List<Integer> order = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = inp.nextInt();
            order.add(num);
        }
        int stock = inp.nextInt();
        Collections.sort(order);   
        unexpectedDemand(order, stock);
        inp.close();
    }

    private static void unexpectedDemand(List<Integer> order, int stock) {
        int ordered = 0;
        
        for (int i = 0; i < order.size(); i++) {
            if(stock>=order.get(i)){
                ordered++;
                stock-=order.get(i);
            }
            else{
                break;
            }
        }
        System.out.println(ordered);
    }
}