import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // House Location
        int s, t;
        s = inp.nextInt();
        t = inp.nextInt();

        // Tree Location
        int a, b;
        a = inp.nextInt();
        b = inp.nextInt();

        // Number of Falling Fruit
        int m, n;
        m = inp.nextInt();
        n = inp.nextInt();

        // array apple
        int apple[] = new int[m];
        for (int i=0; i<m; i++){
            apple[i] = inp.nextInt();
        }

        // array orange
        int orange[] = new int[n];
        for (int i=0; i<n; i++){
            orange[i] = inp.nextInt();
        }

        int appleInHouse = fruitInHouse(s, t, a, apple);
        int orangeInHouse = fruitInHouse(s, t, b, orange);

        System.out.println(appleInHouse);
        System.out.println(orangeInHouse);
        
        inp.close();
    }

    public static int fruitInHouse(int s, int t, int tree, int fruit[]){
        int fruitInHouse = 0;
        for (int i = 0; i < fruit.length; i++) {
            int applePosition = fruit[i]+tree;
            if(applePosition >= s && applePosition <= t){
                fruitInHouse++;
            }
        }
        return fruitInHouse;
    }
}