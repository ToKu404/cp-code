import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int lengthPage = inp.nextInt();
        int page = inp.nextInt();

        minimumFlipBook(lengthPage, page);

        inp.close();
    }

    private static void minimumFlipBook(int lengthPage, int page) {
        int sectionPage = lengthPage%2==0 ? (lengthPage/2) : ((lengthPage-1)/2);
        int searchSection = page%2==0 ? (page/2) : ((page-1)/2);
       
        int result = searchSection<(sectionPage-searchSection) ?  searchSection : (sectionPage-searchSection); 
        System.out.println(result);
    }    
}
